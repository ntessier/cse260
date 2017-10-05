import java.util.ArrayList;
import java.util.LinkedList;
public class CompareCollections {
	public static void main(String[] args)
	{
		LinkedList<Integer> linked = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Integer[] array = new Integer[50000];
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++)
		{
			Integer temp = (int)(Math.random() * 1000 + 1);
			arrayList.add(temp);
		}
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("Time it takes to insert 5000 elements into an arrayList: " + executionTime);
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++)
		{
			Integer temp = (int)(Math.random() * 1000 + 1);
			linked.add(temp);
			
		}
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("TIme it takes to insert 50000 elemetns int oa linkedlist: " + executionTime);
		startTime = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++)
		{
			array[i] = (int)(Math.random() * 1000 + 1);
		}
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Time it takes to insert 50000 elements into array: " + executionTime);
		
		//traverse 
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < arrayList.size(); i++)
		{
			Integer temp = arrayList.get(i);
		}
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Time it takes to traverse 50000 elements of arrayList: " + executionTime);
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < linked.size(); i++)
		{
			Integer temp = linked.get(i);
		}
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Time it takes to traverse linkedlist: " + executionTime);
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < array.length; i++)
		{
			Integer temp = array[i];
		}
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Time to traverse array: " + executionTime);
		
		//remove
		startTime = System.currentTimeMillis();
		for (int i = 0; i < arrayList.size(); i++)
		{
			arrayList.remove(i);
		}
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Time it takes to remove 5000 elements of arrayList: " + executionTime);
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < linked.size(); i++)
		{
			linked.remove(i);
		}
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Time it takes to remove linkedlist: " + executionTime);
		
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < array.length; i++)
		{
			array[i] = null;
		}
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Time to remove array: " + executionTime);
		
		
	}
	

}

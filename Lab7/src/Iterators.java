import java.util.LinkedList;
import java.util.ListIterator;
public class Iterators {
	public static void main(String[] args)
	{
		LinkedList<Integer> ints = new LinkedList<Integer>();
		for (int i = 0; i < 5000; i++)
		{
			int value = (int)(Math.random() * 1000 + 1);
			ints.add(value);
		}
		long startTime = System.currentTimeMillis();
		ListIterator<Integer> iterator = ints.listIterator(0);
		while (iterator.hasNext()) 
		{
			Integer i = iterator.next();
		}
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("It took this long to iterate using an iterator: " + executionTime);
		startTime = System.currentTimeMillis();
		for (int y = 0; y < ints.size(); y++)
		{
			Integer z = ints.get(y);
			
		}
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("It took this long to iterate using get: " + executionTime);
	}
	
}

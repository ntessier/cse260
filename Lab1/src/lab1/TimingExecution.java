package lab1;

import java.util.Arrays;

public class TimingExecution {

	public static void main(String[] args)
	{
		int[] numbers = new int[100000];
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100000);
		}
		int key = (int)(Math.random() * 100000);
		Arrays.sort(numbers);
		long startTime = System.currentTimeMillis();
		long executionTime;
		if (linearSearch(numbers, key) != -1)
		{
			long endTime = System.currentTimeMillis();
			executionTime = endTime - startTime;
			System.out.println("The program took " + executionTime + " milliseconds to find the key");
		}
		else
		{
			long endTime = System.currentTimeMillis();
			executionTime = endTime - startTime;
			System.out.println("The program searched for " + executionTime + "milliseconds and did not find the key");
		}
		startTime = System.currentTimeMillis();
		if (binarySearch(numbers, key) != -1)
		{
			long endTime = System.currentTimeMillis();
			executionTime = endTime - startTime;
			System.out.println("The program took " + executionTime + " milliseconds to find the key");
		}
		else
		{
			long endTime = System.currentTimeMillis();
			executionTime = endTime - startTime;
			System.out.println("The program searched for " + executionTime + "milliseconds and did not find the key");
		}
		
		
    }
	public static int linearSearch(int[] list, int key)
	{
		for (int i = 0; i < list.length; i++)
		{
			if (key == list[i])
				return i;
			
		}
		return -1;
	}
	public static int binarySearch(int[] list, int key)
	{
		int low = 0;
		int high = list.length - 1;
		while (high >= low)
		{
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
			
		}
		return -1;
	}
	
	
	
}

package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers 
{
	
	public static void main(String[] args)
	{
		int i = 0;
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
	
		for (int n = 0; n < 10; n++)
		{
			numbers[n] = -10;
		}
		boolean duplicate = false;
		for (i = 0; i < 10; i++)
		{
			duplicate = false;
			System.out.print("Enter a number: ");
			int z = input.nextInt();
			for (int y = 0; y < 10; y++)
			{
				if(numbers[y] == z)
					duplicate = true;
			}
			if (!(duplicate))
				numbers[i] = z;
				
		
		}
		System.out.println("Here are the distinct numbers... ");
		for ( i = 0; i < numbers.length; i++)
		{
			
			if (numbers[i] != -10)
			{
				System.out.println("" + numbers[i]);
			}
		}
		
		
		
	}
	private static boolean containsNumber(int number, ArrayList<Integer> numbers)
	{
		for (int i = 0; i < numbers.size(); i++)
		{
			if (number == numbers.get(i))
				return true;
		}
		return false;
	}

}

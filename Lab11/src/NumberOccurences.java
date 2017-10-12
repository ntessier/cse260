import java.util.HashMap;
import java.util.Scanner;

public class NumberOccurences {
	public static void main(String[] args)
	{
		HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string to find out the number with the most occurences, enter 0 to quit: ");
		String s = input.nextLine();
		while (!(s.equals("0")))
		{
			numbers.clear();
			String[] nums = s.split(" ");
			
			
			for (int y = 0 ; y < nums.length; y++)
			{
				if (numbers.containsKey(Integer.parseInt(nums[y])))
				{
					int v = numbers.get(Integer.parseInt(nums[y]));
					v++;
					int num = Integer.parseInt(nums[y]);
					
					numbers.put(num, v);
				}
				else
				{
					numbers.put(Integer.parseInt(nums[y]), 1);
				}
				
			}
			int max = 0;
			for (Integer i : numbers.keySet())
			{
				int count = numbers.get(i);
				if (count > max)
					max = count;
			}
			for (Integer i : numbers.keySet())
			{
				int count = numbers.get(i);
				if (max == count)
				{
					System.out.println("Number: " + i + " has the highest number of occurrences with: " + max);
				}
			}
				System.out.println("Enter a new string or zero to quit: ");
				s = input.nextLine();
			}
			
		}
		}



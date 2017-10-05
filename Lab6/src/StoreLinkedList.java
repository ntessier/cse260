import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
public class StoreLinkedList {
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers do you want to enter?: ");
		int numberOfNumbers = input.nextInt();
		int i = 1;
		while (i <= numberOfNumbers)
		{
			System.out.print("\nNumber " + i + ": ");
			int number = input.nextInt();
			if (!list.contains(number))
			{
				list.add(number);
			}
			i++;
		}
		LinkedList<Integer> listToBeSorted, listToBeShuffled, listToBeReversed;
		listToBeSorted = new LinkedList<Integer>();
		listToBeShuffled = new LinkedList<Integer>();
		listToBeReversed = new LinkedList<Integer>();
		for (Integer z : list)
		{
			listToBeSorted.add(z);
			listToBeShuffled.add(z);
			listToBeReversed.add(z);
		}
		Collections.sort(listToBeSorted);
		System.out.println(listToBeSorted);
		Collections.shuffle(listToBeShuffled);
		System.out.println(listToBeShuffled);
		Collections.reverse(listToBeReversed);
		System.out.println(listToBeReversed);
		
	}

}

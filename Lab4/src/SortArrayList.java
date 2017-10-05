import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	public static <E extends Comparable<E>> void sort(ArrayList<E> list)
	{
		int indexOfSmallest;
		for (int i = 0; i < list.size(); i++)
		{
			E smallest = list.get(i);
			indexOfSmallest = i;
			for (int j = 0; j < list.size(); j++)
			{
				if (smallest.compareTo(list.get(j)) > 0)
				{
					
					smallest = list.get(j);
					indexOfSmallest = j;
				}
			}
			Collections.swap(list, i, indexOfSmallest);
		}
	}

}

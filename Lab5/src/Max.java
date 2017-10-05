
public class Max {
	public static <E extends Comparable<E>> E max(E[] list)
	{
		int indexOfMax = 0;
		for (int i = 0; i < list.length; i++)
		{
			E max = list[indexOfMax];
			E compareObject = list[i];
			if (compareObject.compareTo(max) > 0)
			{
				indexOfMax = i;
			}
		}
		return list[indexOfMax];
	}
	public static void main(String [] args)
	{
		Integer[] s = {1,2,3,4,10,9,2,3,21,23};
		int answer= Max.max(s);
		System.out.println(answer);
	}

}

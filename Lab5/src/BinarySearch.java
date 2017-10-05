
public class BinarySearch {
	public static<E extends Comparable<E>> int binarySearch(E[] list, E key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key.compareTo(list[mid]) < 0)
				high = mid - 1;
			else if (key.compareTo(list[mid])== 0)
				return mid;
			else
				low = mid + 1;
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Integer[] s = {1,2,3,4,5,6,7,8,9, 10, 11, 12, 25, 21, 1, 2,3,4,5};
		System.out.println(BinarySearch.binarySearch(s, 0));
	}
}

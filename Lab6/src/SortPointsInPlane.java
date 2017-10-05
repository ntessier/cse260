import java.util.Arrays;

public class SortPointsInPlane {
	public static void main(String[] args)
	{
		Point[] points = new Point[100];
		for (int i = 0; i < points.length; i++)
		{
			int x = (int)(Math.random() * 100);
			int y = (int)(Math.random() * 100);
			points[i] = new Point(x, y);
		}
		
		Arrays.sort(points, new CompareY());
		printNumbers(points);
		Arrays.sort(points);
		printNumbers(points);
	}
	public static void printNumbers(Point[] p)
	{
		for (int i = 0; i < p.length; i++)
		{
			System.out.println("Point " + i + ":" + p[i]);
		}
		System.out.println();
	}

}

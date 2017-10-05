import java.util.Comparator;
public class CompareY implements Comparator<Point> {
	public int compare(Point element1, Point element2)
	{
		if (element1.getY() == element2.getY())
		{
			if (element1.getX() == element2.getX())
				return 0;
			else 
			{
				return element1.getX() - element2.getX();
			}
		}
		else
		{
			return element1.getY() - element2.getY();
		}
	}
	public boolean equals(Point element1, Point element2)
	{
		return compare(element1, element2) == 0;
	}
}


public class Point implements Comparable<Point> {
	private int x;
	private int y;
	public Point()
	{
		x = 0;
		y = 0;
	}
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public int compareTo(Point o)
	{
		if (this.x == o.getX() && this.y == o.getY())
		{
			return 0;
		}
		
		if (this.x == o.getX())
		{
			return this.y - o.getY();
		}
		else
		{
			return this.x - o.getX();
		}
		
		
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	@Override
	public String toString()
	{
		String s = "(" + getX() + ", " +  getY() + ")";
		return s;
	}
	

}

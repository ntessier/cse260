
public class MyPoint {
	private double x;
	private double y;
	public MyPoint(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public MyPoint()
	{
		this(0,0);
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
		
	}
	public double distance(MyPoint p)
	{
		double d = Math.sqrt(Math.pow(getX() - p.getX(), 2) + Math.pow(getY() - p.getY(), 2));
		return d;
	}
	public double distance(double x, double y)
	{
		double d = Math.sqrt(Math.pow(getX() - x, 2) + Math.pow(getY() - y, 2));
		return d;
	}

}

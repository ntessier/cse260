
public class Complex extends Number {
	private double a;
	private double b;
	public Complex()
	{
		a = 0;
		b = 0;
		
	}
	public Complex(double a)
	{
		this.a = a;
		b = 0;
	}
	public Complex(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	public double getRealPart()
	{
		return a;
	}
	public double getImaginaryPart()
	{
		return b;
	}
	public Complex add(Complex c)
	{
		double real;
		double imaginary;
		real = a + c.getRealPart();
		imaginary = b + c.getImaginaryPart();
		return new Complex(real, imaginary);
		
	}
	public Complex subtract(Complex c)
	{
		double real;
		double imaginary;
		real = a - c.getRealPart();
		imaginary = b - c.getImaginaryPart();
		return new Complex(real, imaginary);
		
	}
	public Complex multiply(Complex c)
	{
		double real;
		double imaginary;
		real = ((a * c.getRealPart()) - (b * c.getImaginaryPart()));
		imaginary = ((b*c.getRealPart()) + (a * c.getImaginaryPart()));
		return new Complex(real, imaginary);
	}
	public Complex divide(Complex c)
	{
		double real;
		double imaginary;
		real = (a * c.getRealPart() + b * c.getImaginaryPart()) 
				/ (Math.pow(c.getRealPart(), 2) + Math.pow(c.getImaginaryPart(), 2));
		imaginary = (b * c.getRealPart() - a * c.getImaginaryPart()) 
				/ (Math.pow(c.getRealPart(), 2) + Math.pow(c.getImaginaryPart(), 2));
		return new Complex(real, imaginary);
	}
	public String toString()
	{
		String s = "";
		s = s + "(" + a;
		if (b == 0)
		{
			s += ")";
		}
		else
		{
			s += " + " + b + "i)";
		}
		return s;
	}
	public double doubleValue()
	{
		return 0.0;
	}
	public float floatValue()
	{
		return 0;
	}
	public int intValue()
	{
		return 0;
	}
	public long longValue()
	{
		return 0;
	}
}

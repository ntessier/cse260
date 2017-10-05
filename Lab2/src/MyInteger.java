
public class MyInteger {
	private int value;
	public MyInteger(int v)
	{
		value = v;
	}
	public int getValue()
	{
		return value;
	}
	public boolean isEven()
	{
		if (value % 2 == 0)
			return true;
		else
			return false;
		
	}
	public boolean isOdd()
	{
		if (value % 2 == 1)
			return true;
		return false;
	}
	public boolean isPrime()
	{
		for (int i = 2; i < value; i++)
		{
			if (value % i == 0)
				return false;
			
			
		}
		return true;
	}
	public static boolean isEven(int v)
	{
		if (v % 2 == 0)
			return true;
		else
			return false;
		
	}
	public static boolean isOdd(int v)
	{
		if (v % 2 == 1)
			return true;
		return false;
	}
	public static boolean isPrime(int v)
	{
		for (int i = 2; i < v; i++)
		{
			if (v % i == 0)
				return false;
			
			
		}
		return true;
	
	}
	public static boolean isEven(MyInteger v)
	{
		if (v.getValue() % 2 == 0)
			return true;
		else
			return false;
	}
	public static boolean isOdd(MyInteger v)
	{
		if (v.getValue() % 2 == 1)
			return true;
		
		return false;
	}
	public static boolean isPrime(MyInteger v)
	{
		for (int i = 1; i < v.getValue(); i++)
		{
			if (v.getValue() % i == 0)
				return false;
		}
		return true;
		
	}
	public boolean equals (int v)
	{
		return this.value == v;
	}
	public boolean equals(MyInteger v)
	{
		return v.getValue() == this.getValue();
	}
	public static int parseInt(String s)
	{
		char c;
		int answer = 0;
		for (int i = 0; i < s.length(); i++)
		{
			c = s.charAt(i);
			int a = c - '0';
			answer += a * Math.pow(10, s.length() - i - 1);
		}
		return answer;
		
	}
}

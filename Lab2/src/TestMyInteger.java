
public class TestMyInteger {
	public static void main(String[] args)
	{
		MyInteger number = new MyInteger(2);
		System.out.println(number.getValue() + "");
		System.out.println("isEven()" + number.isEven());
		System.out.println("isOdd()" + number.isOdd());
		System.out.println("isPrime()" + number.isPrime());
		number = new MyInteger(15);
		System.out.println(number.getValue() + "");
		System.out.println("isEven()" + number.isEven());
		System.out.println("isOdd()" + number.isOdd());
		System.out.println("isPrime()" + number.isPrime());
		number = new MyInteger(2);
		System.out.println("Static isEven(11)" + MyInteger.isEven(11));
		System.out.println("Static isOdd(11)" + MyInteger.isOdd(11));
		System.out.println("Static isPrime(11)" + MyInteger.isPrime(11));
		System.out.println("equals(2)" + number.equals(2));
		System.out.println("equals(new MyInteger(7))" + number.equals(new MyInteger(7)));
		
		System.out.println("parseInt(\"5412\")  prints " + MyInteger.parseInt("5412"));
	}
}

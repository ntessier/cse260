import java.util.Scanner;

public class TestComplex {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value for a #1: ");
		double a = input.nextDouble();
		System.out.print("\nEnter value for b #1: ");
		double b = input.nextDouble();
		Complex c1 = new Complex(a, b);
		
		System.out.print("\nEnter value for a #2: ");
		a = input.nextDouble();
		System.out.print("\nEnter value for b #2: ");
		b = input.nextDouble();
		Complex c2 = new Complex(a, b);
		
		System.out.println("Add the two: " + c1.add(c2));
		System.out.println("Subtract the two: " + c1.subtract(c2));
		System.out.println("Multiply the two: " + c1.multiply(c2));
		System.out.println("Divide the two: " + c1.divide(c2));
	}

}

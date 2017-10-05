import java.util.Scanner;
public class TestGenericStackExtendsArrayList {
	public static void main(String[] args)
	{
		GenericStackExtendsArrayList genericStack = new GenericStackExtendsArrayList();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++)
		{
			System.out.print("Enter a string: ");
			String s = input.nextLine();
			System.out.println();
			genericStack.push(s);
			
		}
		System.out.println("Here are your strings in reverse order: ");
		for (int i = 0; i < 5; i++)
		{
			System.out.println(genericStack.pop());
		}
			
	}
}

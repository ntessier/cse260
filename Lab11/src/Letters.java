import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
public class Letters {
	public static void main(String[] args)
	{
		int consonantCount = 0;
		HashMap<Character, Integer> vowels = new HashMap<Character, Integer>();
		vowels.put('A', 0);
		vowels.put('E', 0);
		vowels.put('I', 0);
		vowels.put('O', 0);
		vowels.put('U', 0);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a file name: ");
		String filename = input.nextLine();
		File file = new File(filename);
		input = null;
		try {
			input = new Scanner(file);
		}
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		while (input.hasNext())
		{
			String s = input.next();
			for (int i = 0; i < s.length(); i++)
			{
				char c = s.charAt(i);
				if (Character.isLetter(c))
				{
					Character ch = Character.toUpperCase(c);
					if (vowels.containsKey(ch))
					{
						int vowelCount = vowels.get(ch);
						vowelCount++;
						vowels.put(ch, vowelCount);
						
					}
					else
					{
						consonantCount++;
					}
				}
			}
			
		}
		input.close();
		int totalVowelCount = 0;
		for (int num : vowels.values())
		{
			totalVowelCount+= num;
		}
		System.out.println("Consonant count: " + consonantCount + "\nVowel count: " + totalVowelCount);
	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class AlphabeticalOrder {
	public static void main(String[] args)
	{
		ArrayList<String> wordsList = new ArrayList<String>();
		String pathname = args[0];
		File file = new File(pathname);
		Scanner input = null;
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
			wordsList.add(s);
		}
		Collections.sort(wordsList);
		
		System.out.println(wordsList);
		input.close();
	}

}
//Probability Distribution is on the test in 310
//Poisson Distribution is going to be on the test in 310 i think

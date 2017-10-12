import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashSet;
import java.util.TreeSet;
public class NonduplicateWords {
	public static void main(String[] args)
	{
		TreeSet<String> wordsList = new TreeSet<String>();
		String pathname = args[0];
		File file = new File(pathname);
		Scanner input = null ;
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
		System.out.println(wordsList);
		
	}

}

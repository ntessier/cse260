import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class CountOccurrenceOfWords {
	public static void main(String[] args)
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String filename = args[0];
		File file = new File(filename);
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
			String s = input.next().toLowerCase();
			if (map.containsKey(s))
			{
				int v = map.get(s);
				v++;
				map.put(s, v);
			}
			else
			{
				map.put(s, 1);
				
			}
		}
		ArrayList<WordOccurrence> words = new ArrayList<WordOccurrence>();
		for (String s : map.keySet())
		{
			WordOccurrence w = new WordOccurrence(s, map.get(s));
			words.add(w);
			
		}
		Collections.sort(words);
		System.out.println(words);
		
	}
}

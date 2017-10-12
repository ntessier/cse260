
public class WordOccurrence implements Comparable<WordOccurrence> {
	private String word;
	private int count;
	public WordOccurrence(String w, int c)
	{
		word = w;
		count = c;
	}
	public int compareTo(WordOccurrence wo)
	{
		String s1 = this.word;
		String s2 = wo.word;
		return s1.compareTo(s2);
	}
	public String toString()
	{
		String s = count + " " + word;
		return s;
	}

}

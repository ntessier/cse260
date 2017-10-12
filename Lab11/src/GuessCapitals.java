import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class GuessCapitals {
	public static void main(String[] args)
	{
		String[][] stateCapitals = {
				{"Alabama","Montgomery"},
				{"Alaska", "Juneau"},
				{"Arizona", "Phoenix"},
				{"Arkansas", "Little Rock"},
				{"California", "Sacramento"},
				{"Colorado", "Denver"},
				{"Connecticut", "Hartford"},
				{"Delaware", "Dover"},
				{"Florida", "Tallahassee"},
				{"Georgia", "Atlanta"},
				{"Hawaii", "Honolulu"},
				{"Idaho", "Boise"},
				{"Illinois", "Springfield"},
				{"Indiana", "Indianapolis"},
				{"Iowa", "Des Moines"},
				{"Kansas", "Topeka"},
				{"Kentucky", "Frankfort"},
				{"Louisiana", "Baton Rouge"},
				{"Maine", "Augusta"},
				{"Maryland", "Annapolis"},
				{"Massachusetts", "Boston"},
				{"Michigan", "Lansing"},
				{"Minnesota", "Saint Paul"},
				{"Mississippi", "Jackson"},
				{"Missouri", "Jefferson City"},
				{"Montana", "Helena"},
				{"Nebraska", "Lincoln"},
				{"Nevada", "Carson City"},
				{"New Hampshire", "Concord"},
				{"New Jersey", "Trenton"},
				{"New Mexico", "Santa Fe"},
				{"New York", "Albany"},
				{"North Carolina", "Raleigh"},
				{"North Dakota", "Bismarck"},
				{"Ohio", "Columbus"},
				{"Oklahoma", "Oklahoma City"},
				{"Oregon", "Salem"},
				{"Pennsylvania", "Harrisburg"},
				{"Rhode Island", "Providence"},
				{"South Carolina", "Columbia"},
				{"South Dakota", "Pierre"},
				{"Tennessee", "Nashville"},
				{"Texas", "Austin"},
				{"Utah", "Salt Lake City"},
				{"Vermont", "Montpelier"},
				{"Virginia", "Richmond"},
				{"Washington", "Olympia"},
				{"West Virginia", "Charleston"},
				{"Wisconsin", "Madison"},
				{"Wyoming", "Cheyenne"},
		};
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < stateCapitals.length; i++)
		{
			map.put(stateCapitals[i][0].toLowerCase(), stateCapitals[i][1].toLowerCase());
		}
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a state: ");
		String s = input.nextLine().toLowerCase().trim();
		if (map.containsKey(s))
		{
			System.out.println("The capital is " + map.get(s));
			
		}
		else
		{
			System.out.println("No such state exists.");
		}
				
		}
	}


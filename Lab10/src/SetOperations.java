import java.util.LinkedHashSet;
import java.util.PriorityQueue;
public class SetOperations {
	public static void main(String[] args)
	{
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		set1.add("George");
		set1.add("Jim");
		set1.add("John");
		set1.add("Blake");
		set1.add("Kevin");
		set1.add("Michael");
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		set2.add("George");
		set2.add("Katie");
		set2.add("Kevin");
		set2.add("Michelle");
		set2.add("Ryan");
		System.out.println("Union:");
		System.out.println(SetOperations.UnionOfTwoLinkedHashSets(set1, set2));
		System.out.println("Difference: ");
		System.out.println(SetOperations.DifferenceOfTwoLinkedHashSets(set1, set2));
		System.out.println("Intersection");
		System.out.println(SetOperations.IntersectionOfTwoLinkedHashSets(set1, set2));
	}
	public static LinkedHashSet<String> UnionOfTwoLinkedHashSets(LinkedHashSet<String> s1, LinkedHashSet<String> s2)
	{
		LinkedHashSet<String> tempSet = new LinkedHashSet<String>();
		tempSet.addAll(s1);
		//tempSet.removeAll(s2);
		tempSet.addAll(s2);
		return tempSet;
	}
	public static LinkedHashSet<String> DifferenceOfTwoLinkedHashSets(LinkedHashSet<String> s1, LinkedHashSet<String> s2)
	{
		LinkedHashSet<String> difference = new LinkedHashSet<String>();
		difference.addAll(s1);
		difference.removeAll(s2);
		
		return difference;

	}
	public static LinkedHashSet<String> IntersectionOfTwoLinkedHashSets(LinkedHashSet<String> s1, LinkedHashSet<String> s2)
	{
		LinkedHashSet<String> intersection = new LinkedHashSet<String>();
		
		intersection.addAll(s1);
		intersection.retainAll(s2);
		return intersection;
	}
}

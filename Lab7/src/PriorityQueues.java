import java.util.PriorityQueue;

public class PriorityQueues {
	public static void main(String[] args)
	{
		PriorityQueue<String> p1 = new PriorityQueue();
		p1.offer("George");
		p1.offer("Jim");
		p1.offer("John");
		p1.offer("Blake");
		p1.offer("Kevin");
		p1.offer("Michael");
		PriorityQueue<String> p2 = new PriorityQueue();
		p2.offer("George");
		p2.offer("Katie");
		p2.offer("Kevin");
		p2.offer("Michelle");
		p2.offer("Ryan");
		
		PriorityQueue<String> printQueue = new PriorityQueue();
		printQueue.addAll(p1);
		
		printQueue.removeAll(p2);
		printQueue.addAll(p2);
		
		System.out.println(printQueue); // union
		
		
		
		PriorityQueue<String> intersection = new PriorityQueue();
		intersection.addAll(p1);
		intersection.retainAll(p2);
		System.out.println(intersection);
		
		PriorityQueue<String> difference = new PriorityQueue();
		difference.addAll(p1);
		difference.removeAll(p2);
		System.out.println(difference);
		
		PriorityQueue<String> difference2 = new PriorityQueue();
		difference2.addAll(p2);
		difference2.removeAll(p1);
		System.out.println(difference2);
	}

}

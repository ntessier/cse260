import java.util.PriorityQueue;
public class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable {
	public MyPriorityQueue<E> clone()
	{
		MyPriorityQueue<E> queue = new MyPriorityQueue<E>();
		for (E e : this)
		{
			queue.offer(e);
		}
		return queue;
	}
}

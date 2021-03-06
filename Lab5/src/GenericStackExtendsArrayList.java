import java.util.ArrayList;
public class GenericStackExtendsArrayList<E> extends ArrayList<E> {
	public int getSize()
	{
		return size();
	}
	public E peek()
	{
		return get(size() - 1);
	}
	public E pop()
	{
		E o = get(size() - 1);
		remove(size() - 1);
		return o;
	}
	public void push (E o)
	{
		add(o);
	}
	public boolean isEmpty()
	{
		return isEmpty();
	}
	public String toString()
	{
		return "stack: " + super.toString();
	}

}

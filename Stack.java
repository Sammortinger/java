import java.util.LinkedList;
import java.util.List;

public class Stack<T> {
	private List<T> values;
	
	public Stack()
	{
		values = new LinkedList<T>();
	}
	
	public Stack(List<T> input)
	{
		values = new LinkedList<T>();
		for (int i = 0; i < input.size(); i++)
		{
			this.push(input.get(i));
		}
	}
	
	public T pop()
	{
		return values.remove(0);
	}
	
	public void push(T value)
	{
		this.values.add(0, value);
	}
	
	public void flip()
	{
		Stack<T> temp = new Stack<T>();
		for (int i = 0; i < values.size(); i++)
		{
			temp.push(this.pop());
		}
		this.values = temp.getValues();
	}
	
	public List<T> getValues()
	{
		return values;
	}
}

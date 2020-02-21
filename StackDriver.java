import java.util.ArrayList;

public class StackDriver {
	public static void main(String[] args)
	{
		ArrayList<Integer> input = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++)
		{
			input.add((int) (Math.random()*1000)); 
		}
		
		Stack<Integer> test = new Stack<Integer>(input);
		
		System.out.println(test.getValues());
	}
}

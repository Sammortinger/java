import java.util.Arrays;

public class RecursionDriver {
	public static void main(String[] args)
	{
		int[] toSearch = {3, 14, 5, 19, 22, 11, 23, 87, 15, 33, 21, 97, 11};
		
		System.out.println("Value (18) is in array: " + Recursion.contains(toSearch, 18));
		System.out.println("Value (21) is in array: " + Recursion.contains(toSearch, 21));
		System.out.println("Sorted(ascending) Array: " + Arrays.toString(Recursion.sort(toSearch)));
		System.out.println("First index of value (11): " + Recursion.indexOf(toSearch, 11));
		System.out.println("Last index of value (11): " + Recursion.lastIndexOf(toSearch, 11));
		
		int[] flipped = Recursion.flip(toSearch);
		
		System.out.println("New Array: " + Arrays.toString(flipped));
		System.out.println("Original Array: " + Arrays.toString(toSearch));
	}
}

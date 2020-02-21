import java.util.Arrays;

public class Recursion {
	/**
	 * Sorts the array in ascending order.
	 * @param in The array to be sorted
	 * @return A copy of the array, sorted in ascending order
	 */
	public static int[] sort(int[] in) {
		
		//base case
		if (in.length <= 1) {
			return in;
		}
		int[] toReturn = new int[in.length];
		int[] front = Arrays.copyOfRange(in, 0, in.length / 2);
		int[] back = Arrays.copyOfRange(in, in.length / 2, in.length);
		
		//Recursive calls
		front = sort(front);
		back = sort(back);
		
		int countFront = 0;
		int countBack = 0;
		for (int i = 0; i < toReturn.length; i++) {
			int frontNum = (countFront >= front.length) ? Integer.MAX_VALUE : front[countFront];
			int backNum = (countBack >= back.length) ? Integer.MAX_VALUE : back[countBack];
			if (frontNum <= backNum)
			{
				toReturn[i] = frontNum;
				countFront++;
			}
			else
			{
				toReturn[i] = backNum;
				countBack++;
			}
		}
		return toReturn;
	}
	/**
	 * Checks whether an array contains a value.
	 * @param in The array to search
	 * @param toFind the value to search for
	 * @return true if the array contains the desired value. Otherwise returns false.
	 */
	public static boolean contains(int[] in, int toFind)
	{
		//base case
		if (in.length == 1)
		{
			return in[0] == toFind;
		}
		int[] sorted = sort(in);
		if(sorted[sorted.length/2] < toFind)
		{
			//recursive call
			return contains(Arrays.copyOfRange(sorted, in.length/2, in.length), toFind);
		}
		else if (sorted[sorted.length/2] > toFind)
		{
			//recursive call
			return contains(Arrays.copyOfRange(sorted, 0, in.length/2), toFind);
		}
		else
		{
			return true;
		}
	}
	
	/**
	 * Returns first index of a value in an int[] array. The array must contain the value being searched for.
	 * 
	 * @param in the array to search
	 * @param value the value to search for
	 * @return The first index in the array that contains value
	 */
	public static int indexOf(int[] in, int value)
	{
		//base case
		if(in.length == 1)
		{
			return 0;
		}
		int[] left = Arrays.copyOfRange(in, 0, in.length/2);
		int[] right = Arrays.copyOfRange(in, in.length/2, in.length);
		
		if (Recursion.contains(left, value))
		{
			//recursive call
			return indexOf(left, value);
		}
		else
		{
			//recursive call
			return in.length/2 + indexOf(right, value);
		}
	}
	/**
	 * Returns last index of a value in an int[] array. The array must contain the value being searched for
	 * 
	 * @param in the array to search
	 * @param value the value to search for
	 * @return The last index in the array that contains value
	 */
	public static int lastIndexOf(int[] in, int value)
	{
		//base case
		if(in.length == 1)
		{
			return 0;
		}
		int[] left = Arrays.copyOfRange(in, 0, in.length/2);
		int[] right = Arrays.copyOfRange(in, in.length/2, in.length);
		
		if (Recursion.contains(right, value))
		{
			//recursive call
			return in.length/2 + lastIndexOf(right, value);
		}
		else
		{
			//recursive call
			return lastIndexOf(left, value);
		}
	}
	/**
	 * Returns an array of equal size with the order of values reversed. Does not change input array.
	 * @param in Array to be "flipped". Does not get changed
	 * @return An array of equal size but with the order of values reversed
	 */
	/*
	 * Overloading method due to lack of optional parameters in Java. This was the only way I could think of to not require indices
	 * to be stated by user
	 */
	public static int[] flip(int[] in)
	{
		int[] temp = in.clone();
		return flip(temp, 0, temp.length-1);
	}
	
	/*
	 * Not how I would have wanted to do it, but I can't think of another way for now (using my original logic)
	 * Private so user does not call this by accident
	 */
	private static int[] flip(int[] in, int beginIndex, int endIndex)
	{
		if(beginIndex >= endIndex)
		{
			return in;
		}
		int temp = in[endIndex];
		in[endIndex] = in[beginIndex];
		in[beginIndex] = temp;
		return flip(in, beginIndex+1, endIndex-1);
		
	}
}

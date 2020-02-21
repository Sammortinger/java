/*
* Compute the hypotenuse, given the length of the two opposing sides, or a side given the length of the hypotenuse and the other side
*
* Author: Samuel Mortinger
*/
import java.util.*;

class Hypot {
	public static void main(String args[]){
		double x = 0, y = 0, z = 0;
		boolean validInput = false;
		String method = "";
		Scanner in = new Scanner(System.in);
		
		while (!validInput)
		{
			System.out.println("Would you like to calculate using 2 sides (enter \"side\") or one side and the hypotenuse (enter \"hypotenuse\")?");
			method = in.nextLine();
			if(method.equalsIgnoreCase("side") || method.equalsIgnoreCase("hypotenuse"))
			{
				validInput = true;
			}
			else
			{
				System.out.println("Invalid Input!");
			}
		}
		
		validInput = false;
		
		if(method.equalsIgnoreCase("side"))
		{
			while (!validInput)
			{
				//counter to track invalid inputs
				int count = 2;
				System.out.println ("Enter the length of side 1 as a number: ");
				
				//Try to set x to input, if the input is a number
				try
				{
					x = in.nextDouble();
					String garbage = in.nextLine();
					//make sure x is a valid number
					if (x<=0)
					{
						count--;
					}
					
				}
				catch (Exception e)
				{
					count--;
				}
				System.out.println ("Enter the length of side 2 as a number: ");
				
				//Try to set y to input, if the input is a number
				try
				{
					y = in.nextDouble();
					String garbage = in.nextLine();
					//make sure y is not an invalid number
					if (y <= 0)
					{
						count--;
					}
				}
				catch (Exception e)
				{
					count--;
				}
				//if either input was invalid
				if (count < 2)
				{
					System.out.println("Invalid inputs, try again");
					String garbage = in.nextLine();
				}
				else {
					validInput = true;
				}
			}
			z = Math.sqrt(x*x + y*y);
			// Print result
			System.out.println("hypotenuse is: " + z);
		}
		else
		{
			while (!validInput)
			{
				int count = 2;
				System.out.println ("Enter the length of the hypotenuse as a number: ");
				
				//Try to set z to input, if the input is a number
				try
				{
					z = in.nextDouble();
					String garbage = in.nextLine();
					
					//make sure z is a valid number
					if(z<=0)
					{
						count--;
					}
					
				}
				catch (Exception e)
				{
					count--;
				}
				System.out.println ("Enter the length of side 1 as a number: ");
				
				//Try to set y to input, if the input is a number
				try
				{
					y = in.nextDouble();
					String garbage = in.nextLine();
					
					//ensure y is a valid number, and that the hypotenuse > side
					if (y<=0 || z <= y)
					{
						count--;
					}
					
				}
				catch (Exception e)
				{
					count--;
				}
				//if either input was invalid, including side being greater than hypotenuse
				if (count < 2)
				{
					System.out.println("Invalid inputs, try again");
					String garbage = in.nextLine();
				}
				else {
					validInput = true;
				}
			}
			x = Math.sqrt((z*z) - (y*y));
			System.out.println("The length of side two is " + x);
		}
		in.close();
	}
}
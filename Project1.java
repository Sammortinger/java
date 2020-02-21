/*
 * Authors: Thomas McDonnell, Sam Mortinger
 */
public class Project1 {
	public static void main(String[] args) {
		String str1 = "";
		String outStr = "";

		if (args.length != 1)
			str1 = "not found";
		else
			str1 = args[0].toLowerCase();

		switch (str1) {
			case "arithmetic operators":
				outStr = "+ (Addition), - (Subtraction), * (Muitiplication), /(Division), % (Modulus)";
				break;
			case "equality operators":
				outStr = "== (Equal To), != (Not Equal To) ";
				break;
			case "relational operators":
				outStr = "> (Greater Than), < (Less Than), >= (Greater Than or Equal To), <= (Less Than or Equal To)";
				break;
			default:
				outStr = "Not Found";
				break;
		}
		System.out.println(outStr);

	}
}

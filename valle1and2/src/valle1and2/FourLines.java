package valle1and2;

public class FourLines {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose: This program displays text to output, and calculates a simple expression.
	 * Pseudo-Code:
	 * - Print my name using println()
	 * - Print the name of the programmer who created java using println()
	 * - Print "Java rocks!" using println()
	 * - Print result of the expression (12.5 + 5.5 / 3) / (6.25 * 6 - 5.0) using println(), with the expression calculated in the statement (without assigning the expression to a variable)
	 */
	public static void main(String[] args) {
		//Simple line printing
		System.out.println("My name is Felo Malachi Valle");
		System.out.println("Java was created by a team led by James Gosling");
		System.out.println("Java rocks!");
		
		// Include the expression in the println() statement to follow prompt, I believe the println() function converts the result to string in order to display it
		System.out.println((12.5 + 5.5 / 3) / (6.25 * 6 - 5.0));
	}

}

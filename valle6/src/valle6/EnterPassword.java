package valle6;

import java.util.Scanner;

public class EnterPassword {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This program verifies a password using a single regex statement
	 * Pseudo-Code:
	 * - 1 or more upper case letters
	 * - two lower case letters
	 * - 1 or 2 digits
	 * - zero or 1 upper case letters
	 * - any two of this group @#$%^&
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Enter Your Password:");
		String pass = keyboard.nextLine();
		keyboard.close();
		//Single regex statement
		System.out.println(pass.matches("[A-Z]+[a-z]{2}\\d{1,2}[A-Z]?[@#$%^&]{2}"));
	}

}

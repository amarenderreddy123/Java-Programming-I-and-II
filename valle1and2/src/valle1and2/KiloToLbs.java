package valle1and2;
import java.util.Scanner;
public class KiloToLbs {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose: This program converts user inputted kilograms to pounds and displays the result.
	 * Pseudo-Code:
	 * - Create new scanner object, and create conversion rate variable
	 * - Get kilograms from user and assign it to a variable
	 * - Close scanner object
	 * - Convert kilograms to pounds using that variable
	 * - Display pounds
	 */
	public static void main(String[] args) {
		//Create new scanner object and a constant conversion rate variable.
		Scanner keyboard = new Scanner(System.in);
		final double CONVERSION = 2.204;
		
		//Prompt user and get new variable named, kilograms
		System.out.println("Enter kilograms: ");
		double kilograms = keyboard.nextDouble();
		
		//Closed the scanner object AFTER collecting input
		keyboard.close();
		
		//Convert kilograms to pounds
		double pounds = (kilograms * CONVERSION);
		System.out.println(kilograms + " kilograms is equal to " + pounds + " pounds.");
	}

}

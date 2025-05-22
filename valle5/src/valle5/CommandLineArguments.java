package valle5;

import java.util.Arrays;

public class CommandLineArguments {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose: This program accepts command line arguments of any amount of integers.  It then displays what it was passed, and the sum.
	 * Pseudo-Code:
	 * - In IDE, set command line arguments
	 * - Loop through each passed argument, and convert each argument to int type
	 * - Calculate sum using sumInts method
	 * - In main, display the values that were passed and the sum of the values
	 */
	public static void main(String[] args) {
		//Create new array with the size of the amount of command line arguments
		int[] mainArray = new int[args.length];

		//"Cast" the command line arguments to the new int array
		for(int i = 0; i < args.length; i++) {
			mainArray[i] = Integer.parseInt(args[i]);
		}

		//Use sumInts method
		int sum = sumInts(mainArray);

		//Display Output
		System.out.printf("Passing %s\nSum is %d", Arrays.toString(mainArray), sum);
	}
	public static int sumInts(int[] array) {
		int summ = 0;
		//Used a foreach loop to account for any array size
		for(int element : array) {
			summ += element;
		}
		return summ;
	}
}
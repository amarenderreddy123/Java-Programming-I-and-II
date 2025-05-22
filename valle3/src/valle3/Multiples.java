package valle3;
/* Author: Felo Malachi Valle
* SPC ID#: 2394922
* Purpose: This program iterates through 300 and 200 going down.  It displays multiples of 11 or multiples of 13 (with formatting), not both.  Then displays the amount of values found and their total.
* Pseudo-Code:
* - Iterate through 300 and 200 inclusively, going down.
* - For each number check if i is a multiple of 11 or 13, not both.
* - If i is a multiple, add to total and add 1 to formatIterator.
* - If 5 multiples have been printed, print new line.
* - Display amount of digits (using formatIterator) and their total (using total).
*/
public class Multiples {
	public static void main(String[] args) {
		//Iterator and total variables
		int formatIterator = 1;
		int total = 0;
		//Loop
		for (int i = 300; i >= 200; i--) {
			if(i % 11 == 0 && i % 13 != 0) {
				System.out.printf("%-8d", i);
				if(formatIterator % 5 == 0) {
					System.out.printf("\n");
				}
				formatIterator++;
				total += i;
			}
			else if(i % 13 == 0 && i % 11 != 0) {
				System.out.printf("%-8d", i);
				if(formatIterator % 5 == 0) {
					System.out.printf("\n");
				}
				formatIterator++;
				total += i;
			}
		}
		System.out.printf("Found %d integers totaling %d", formatIterator-1, total);
	}

}

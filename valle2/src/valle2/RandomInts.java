package valle2;
/* Author: Felo Malachi Valle
* SPC ID#: 2394922
* Purpose: This program generates two different ints between 25 and 75 inclusively, displays them, and displays the positive difference.
* Pseudo-Code:
* - Generate two random numbers between 25 and 75 inclusively.
* - Print both these numbers.
* - Print the positive difference using a selection statement. (no math.abs())
*/
public class RandomInts {

	public static void main(String[] args) {
		
		//Generate two random ints
		int intOne = (int)(Math.random() * 51) + 25;
		int intTwo = (int)(Math.random() * 51) + 25;
		
		System.out.printf("The first int is %d\n", intOne);
		System.out.printf("The second int is %d\n", intTwo);
		
		//Selection statement
		if (intOne>intTwo) {
			System.out.printf("The difference between these two numbers is %d\n", intOne - intTwo);
		}
		else if (intOne == intTwo) {
			System.out.println("These numbers are the same!");
		}
		else {
			System.out.printf("The difference between these two numbers is %d\n", intTwo - intOne);
		}
	}

}

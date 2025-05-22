package valle3;
/* Author: Felo Malachi Valle
* SPC ID#: 2394922
* Purpose: This program asks simple multiplication questions and keeps track of how many the user has gotten correct.  Infinite loop that is ended by user input.
* Pseudo-Code:
*   In the loop:
*   - Generate 2 random numbers between 1 and 9.
*   - Ask user for product of those 2 numbers.
*   - Collect user input.
*   - If the user is correct, display correct message and increase the correct counter.
*   - If the user is incorrect, display the correct answer.
*   - After each question, ask user if they wish to continue. (reiterate the loop)
*   Outside the loop:
*   - Close scanner object, and display how many questions they got correct.
*/
import java.util.Scanner;
public class MultQuiz {
	public static void main(String[] args) {
		//Variable Declarations
		Scanner keyboard = new Scanner(System.in);
		boolean control = true; //Loop control
		char confirm = ' '; //Continue Option (y or n)
		int varOne = 0; //First random number
		int varTwo = 0; //Second random number
		int answer = 0; //Inputted answer
		int correct = 0; //Amount of correct answers
		int iterations = 0; //Amount of questions asked
		
		while(control) {
			//Part 1 - Generate random numbers, ask question, increment iterations, and collect input.
			varOne = (int)(Math.random() * 9) + 1;
			varTwo = (int)(Math.random() * 9) + 1;
			System.out.printf("What is %d * %d? ", varOne, varTwo);
			iterations++;
			answer = keyboard.nextInt();
			
			//Part 2 - Compute if their answer is correct and make adjustments to corresponding variables.
			if(answer == (varOne * varTwo)) {
				System.out.println("Correct. Nice work!");
				correct++;
			}
			else {
				System.out.printf("Incorrect. The product is %d\n", varOne * varTwo);
			}
			
			//Part 3 - Determine whether the user would like to continue. (reiterate the loop)
			System.out.println("Want more questions y or n? ");
			confirm = keyboard.next().charAt(0);
			if(confirm == 'n') {
				control = false;
			}
		}
		keyboard.close();
		System.out.printf("You scored %d out of %d", correct, iterations);
	}

}

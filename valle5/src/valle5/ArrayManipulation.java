package valle5;

public class ArrayManipulation {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose: This program manipulates an array by adding 8 random values, sorting them, and finding the lowest and highest values
	 * Pseudo-Code:
	 * - Add 8 random integers to array
	 * - Pass array to method that sorts and returns an array of the lowest and highest values
	 * - Print returned array (lowest and highest value array) in main
	 * - Print sorted array in main using foreach loop
	 * - In the foreach loop in previous step, count evens and odds, and calculate total
	 * - Print evens, odds, and total
	 */
	public static void main(String[] args) {
		//Variable Declarations
		int[] mainArray = new int[8];
		int[] lowestAndHighest = new int[2];
		int randomNumber = 0; //temp value for adding random numbers to array
		int evens = 0; //counter
		int odds = 0; //counter

		//for loop that adds 8 random integers to mainArray
		for(int i = 0; i < 8; i++) {
			randomNumber = (int)(Math.random() * 51) + 50;
			mainArray[i] = randomNumber;
		}

		//Sending the unsorted array to method that will sort and return the lowest and highest values
		lowestAndHighest = sortAndReturn(mainArray);

		//Output Code
		System.out.printf("The lowest element is %d\nThe highest element is %d\nHere is the array\n", lowestAndHighest[0], lowestAndHighest[1]);
		int sum = 0;
		for(int element : mainArray){
			sum += element;
			//if-else that adds one to either evens or odds, depending on element
			if(element % 2 == 0) {
				evens++;
			}
			else {
				odds++;
			}
			System.out.printf("%d ", element);
		}
		System.out.printf("\nEvens: %d, odds: %d\nTotal: %d", evens, odds, sum);
	}
	public static int[] sortAndReturn(int[] givenArray){
		//Selection Sort Algorithm (Could have used Arrays.sort() but wanted to be familiar with how selection sort works
		int minIndex = 0;
		int temp = 0;
		for(int i = 0; i < givenArray.length - 1; i++) {
			minIndex = i; //Set minIndex to the current iteration of outer loop
			//Iterate through all elements after the "lowest" element
			for(int j = i + 1; j < givenArray.length; j++) {
				if(givenArray[j] < givenArray[minIndex]) {
					minIndex = j;
				}
			}
			//if the previous loop found a new "lowest" value
			if(minIndex != i) {
				//Swap the two values
				temp = givenArray[minIndex];
				givenArray[minIndex] = givenArray[i];
				givenArray[i] = temp;
			}
		}
		//Returns the highest and lowest value
		int[] lowestHighest = new int[2];
		lowestHighest[0] = givenArray[0];
		lowestHighest[1] = givenArray[givenArray.length - 1];
		return lowestHighest;
	}
}
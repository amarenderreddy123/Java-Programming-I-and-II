package valle7;

import java.util.Scanner;

public class SearchIntArray {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This program searches through an array to find a number and returns the index value if it is found.  If the number is not found, it throws a custom exception.
	 * Pseudo-Code:
	 * - In a try block, create new array, get search term from user, and call returnIndex.
	 * - In returnIndex, check each item to see if it is the needle in the haystack and return the index if it is.
	 * - If its not found, throw new exception.
	 */
	public static void main(String[] args) {
		try {
			int[] array = {1,2,3,5,8,13,21,34,55,89,144};
			Scanner keyboard=new Scanner(System.in);
			System.out.printf("Enter what number you'd like to search for: ");
			int search=keyboard.nextInt();
			keyboard.close();
			System.out.printf("Index: %d", returnIndex(array, search));
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int returnIndex(int[] haystack, int needle) throws Exception {
		for (int i = 0; i < haystack.length; i++) {
			if (haystack[i] == needle) {
				return i;
			}
		}
		throw new Exception("Element not found in array");
	}
}

package valle5;

import java.util.ArrayList;
import java.util.Iterator;

public class NameArrayLists {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose: Manipulate an ArrayList of celebrity names.
	 * Pseudo-Code:
	 * - Add 5 names to the ArrayList
	 * - Display names using a for loop and get() method (1st print)
	 * - Pass list to void method that inserts a new name at index 2, and removes the name at index 4, and displays the list using a foreach loop (2nd print)
	 * - Create new iterator object
	 * - Use the new iterator to display the new updated ArrayList (3rd print)
	 */
	public static void main(String[] args) {
		//Creation of array list and adding of 5 names
		ArrayList<String> names = new ArrayList<String>();
		names.add("Lionel Messi");
		names.add("Drake");
		names.add("Adele");
		names.add("Dwayne Johnson");
		names.add("Beyonce");
		
		//1st Print using .get()
		System.out.println("Here is the list");
		for(int i = 0; i < names.size(); i++) {
			System.out.printf("%s\n", names.get(i));
		}
		
		//2nd Print (in method)
		voidMethod(names);
		
		//3rd Print using Iterator
		System.out.println("Using an iterator, here is the list");
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			System.out.printf("%s\n", iter.next());
		}
	}
	
	public static void voidMethod(ArrayList<String> nameList) {
		nameList.add(2, "Taylor Swift");
		nameList.remove(4);
		System.out.println("Here is the new list");
		for(String element : nameList) {
			System.out.printf("* %s ", element);
		}
		System.out.printf("\n");
	}

}

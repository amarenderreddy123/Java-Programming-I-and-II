package valle13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestAutos {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This program tests an Automobile class that implements the Comparable interface.
	 * Pseudo-Code:
	 * - Create an array list of automobiles
	 * - Add 6 automobiles to the array list
	 * - Display list using for loop
	 * - Sort by year using the Comparable interface and Collections.sort()
	 * - Display list using foreach loop
	 */
	public static void main(String[] args) {
		//Create an array list of 6 cars
		List<Automobile> arr = new ArrayList<Automobile>(Arrays.asList(new Automobile("Hyundai", "Ioniq5", 2021, 49270),new Automobile("Honda", "Civic", 2023, 28450), new Automobile("Genesis", "G80", 2019, 30195), new Automobile("Chevrolet", "Malibu", 2021, 21750), new Automobile("Kia", "Optima", 2019, 21995), new Automobile("Audi", "A4", 2020, 33980)));
		
		//Output the unsorted list
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).toString());
		}
		
		//Sort by year using Comparable interface.
		System.out.println("Sorted the list by year:");
		Collections.sort(arr);
		
		//Output the sorted list
		for(Automobile element : arr) {
			System.out.println(element.toString());
		}
	}

}

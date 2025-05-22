package valle13;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TestPet {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This program tests Pet.java, Dog.java, Reptile.java, and Mobility.java
	 * Pseudo-Code:
	 * - Create Reptile pet and display it
	 * - Create an array of at lest four Dogs.
	 * - Sort by weight.
	 * - Display dogs using foreach loop.
	 */
	public static void main(String[] args) {
		//create new reptile and display it
		Pet lizard = new Reptile("Slinky", 'M', new Date(), "rock python");
		System.out.println(lizard.toString());
		
		//Created an array of dogs but I couldn't find out how to implement compareTo() and Comparable interface with an array, so I converted it to a List in order to use Collections.sort().
		Dog[] dogs = {new Dog("Butch", 'M', new Date(), "altasian", 90), new Dog("Marley", 'M', new Date(), "pug", 20), new Dog("Sacha", 'F', new Date(), "beagle", 25), new Dog("Pedro", 'M', new Date(), "chihuahua", 14)};
		List<Dog> arr = Arrays.asList(dogs);
		Collections.sort(arr);
		
		//display using foreach
		for(Dog object : arr) {
			System.out.println(object.toString());
		}
	}

}

package valle11;

import java.util.ArrayList;
import java.util.Arrays;

public class ShipTest {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This program utlizes classes and inheritance to create subclasses.  This file tests those classes, their functions, and their properties.
	 * Pseudo-Code:
	 * - Create 5 objects with different declared types and actual types. (As told in instructions)
	 * - Create new array of all these objects, then print using the array.
	 * - Create new ArrayList of type Ship using the previous Ship array.
	 * - Send ArrayList to a method that will print the array, as well as count the number of ships that sank using Ship.isAfloat(.
	 */
	public static void main(String[] args) {
		//Create 5 objects
		Ship cruiseOne = new CruiseShip("Magic", 1998, true, 2700, "Caribbean");
		Ship cruiseTwo = new CruiseShip("Titanic", 1912, false, 1300, "Atlantic Ocean");
		Ship cargoOne = new CargoShip("El Faro", 1974, false, "containers", 391);
		CargoShip cargoTwo = new CargoShip("Seawise Giant", 1979, false, "crude oil", 564763);
		WarShip warOne = new WarShip("USS Nimitz", 1972, true, "super carrier", "United States Navy");

		//Create Ship array and print each ship
		Ship[] fleet = {cruiseOne, cruiseTwo, cargoOne, cargoTwo, warOne};
		System.out.printf("AN ARRAY OF SHIPS IN MAIN\n");
		for(int i=0; i<fleet.length;i++) {
			System.out.print(fleet[i].toString());
		}
		//ArrayList creation and shipShow method call
		ArrayList<Ship> fleetList = new ArrayList<Ship>(Arrays.asList(fleet));
		System.out.printf("%d of these ships sank!", shipShow(fleetList));
	}

	public static int shipShow(ArrayList<Ship> array) {
		int sank=0; //counter
		array.remove(2);  //remove specified item
		array.add(new WarShip("USS John Warner", 2015, true, "attack submarine", "United States Navy"));
		System.out.printf("AN ARRAY OF SHIPS FROM A METHOD\n");
		for(Ship element:array) {
			if(!element.isAfloat()) {
				sank++;
			}
			System.out.print(element.toString());
		}
		return sank;
	}
}

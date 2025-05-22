package valle2;
import java.util.ArrayList;
import java.util.Scanner;
/* Author: Felo Malachi Valle
* SPC ID#: 2394922
* Purpose: This program accepts a full name and separates into three string variables, then displays information about those variables.
* Pseudo-Code:
* - Input full name.
* - Process name into three variables, first, middle, and last.
* - Print the following outputs
*   Outputs:
* 	- Output length of the full name
* 	- Output length of the middle name
* 	- Output the three initials of the name
* 	- Output the name in all uppercase
*/
public class NameManipulation {
	public static void main(String[] args) {
		//ArrayList to hold the strings, instead of creating 3 separate strings and methods.
		ArrayList<String> names = new ArrayList<String>();
		
		//Create new scanner object and inputs full name
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a first name middle name and surname: ");
		String fullName = keyboard.nextLine();
		keyboard.close();
		
		//Method dissectFullName is used here to separate the names into three strings
		names = dissectFullName(fullName);

		//Prints outputs. (see pseudocode)
		System.out.printf("Length of your name: %d characters\n", fullName.length());
		System.out.printf("Length of your middle name: %d characters\n", names.get(1).length() );
		System.out.printf("Your initials are %c%c%c\n", names.get(2).charAt(0), names.get(1).charAt(0), names.get(0).charAt(0));
		System.out.println(fullName.toUpperCase());
	}
	

	public static ArrayList<String> dissectFullName(String name){
		ArrayList<String> n = new ArrayList<String>(); // Return Value - n, an arraylist, which will contain 3 names; first, middle, and last
		int index = name.length()-1;  //Initialize index to index position of the last character in string name
		char c = ' '; //Initialize char c to ' '
		String currentName = ""; //Placeholder string variable to be added to n via .add()
		do {
			//Set c to last character, at position 'index'
			c = name.charAt(index);

			//If the current char is a spacebar, add name from that point forward to n. Also decrement index.
			if (c == ' ') {
				currentName = name.substring(index + 1);
				n.add(currentName);
				name = name.substring(0, index); //Remove the name that was just added to n.
				index--;
			}
			else if (index == 0) {
				n.add(name); //Add "first" name to n.
				break; //Breaks do-while loop.
			}
			//If character is not spacebar, and index is not 0, decrement index and loop.
			else {
				index--;
			}
		}while(true);
		return n;
	}
}

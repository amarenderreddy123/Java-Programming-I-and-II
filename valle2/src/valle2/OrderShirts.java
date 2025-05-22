package valle2;
import java.text.NumberFormat;
import java.util.Scanner;
/* Author: Felo Malachi Valle
* SPC ID#: 2394922
* Purpose: This program accepts a number of shirts, and displays order information based on the amount of shirts being ordered.
* Pseudo-Code:
* - Accept a number of shirts.
* - Calculate the extended price of the shirts.
* - Calculate the shipping charges of the order.
* - Display the extended price, the shipping charges, and the total cost of the order.
*/
public class OrderShirts {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many shirts would you like to order: ");
		
		//Variable Declarations
		final double UNITCOST = 24.95;
		double discount = 0;
		double extendedCost = 0;
		double shippingCharges = 0;
		int shirts = keyboard.nextInt();
		keyboard.close();
		
		//Selection statement because there are discounts for different amounts of shirts
		if (shirts < 0) {
			//Might be sub-optimal but I figured I would attempt to learn exception handling
			throw new ArithmeticException("int shirts less than 0");
		}
		//Case for 1-2 shirts
		else if (shirts < 3) {
			shippingCharges = 6.99;
			extendedCost = shirts * (UNITCOST * (1 - discount));
		}
		//Case for 3-6 shirts
		else if (shirts < 7) {
			shippingCharges = 5.49;
			discount = 0.1;
			extendedCost = shirts * (UNITCOST * (1 - discount));
		}
		//Case for 7-9 shirts
		else if (shirts < 10) {
			shippingCharges = 4.00;
			discount = 0.2;
			extendedCost = shirts * (UNITCOST * (1 - discount));
		}
		//Case for 10+ shirts
		else {
			discount = 0.3;
			extendedCost = shirts * (UNITCOST * (1 - discount));
		}
		//Formatting outputs with currency formatting
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		System.out.printf("Extended Cost: %s\n", formatter.format(extendedCost));
		System.out.printf("Shipping Cost: %s\n", formatter.format(shippingCharges));
		System.out.printf("Total: %s\n", formatter.format(extendedCost+shippingCharges));
	}
}
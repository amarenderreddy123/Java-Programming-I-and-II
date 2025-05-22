package valle3;
/* Author: Felo Malachi Valle
* SPC ID#: 2394922
* Purpose: This program iterates through -40 and 120 degrees fahrenheit by 5, and for each temperature, it displays both the fahrenheit and celsius equivalent.
* Pseudo-Code:
* - Iterate by 5 through -40 and 120.
* - For each value, convert to celsius and print a line displaying both fahrenheit and its celsius equivalent (to 2 decimal places).
*/
public class TemperatureChart {
	public static void main(String[] args) {
		double celsius = 0;
		for(double fahrenheit =- 40; fahrenheit <= 120; fahrenheit += 5) {
			celsius = ((fahrenheit - 32) * 5) / 9;
			System.out.printf("%6.2f\t%6.2f\n", fahrenheit, celsius);
		}
	}
}
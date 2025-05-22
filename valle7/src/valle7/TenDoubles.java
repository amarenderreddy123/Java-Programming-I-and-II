package valle7;

import java.util.Scanner;

public class TenDoubles {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This program creates 10 random doubles, and has 2 methods.  One can add those doubles to a text file, one per line. The other reads the text file, displays numbers in console, and displays their sum.
	 * Pseudo-Code:
	 * - Create 10 random doubles
	 * - Calls writeToFile which writes params into text file
	 * - Calls readFile which opens text files, and displays their content and sum.
	 */
	public static void main(String[] args) throws Exception {
		double[] doubles = new double[10];
		for(int i=0; i < doubles.length; i++){
			doubles[i] = Math.random() * 11;
			System.out.println(doubles[i]);
		}
		writeToFile(doubles);
		readFile();
	}
	
	
	public static void writeToFile(double[] array) throws Exception {
		//Use PrintWriter to write to file
		java.io.PrintWriter output = new java.io.PrintWriter("output.txt");
		for(double element : array){
			output.println(element);
		}
		output.close();
	}
	
	
	public static void readFile() throws Exception{
		java.io.File file = new java.io.File("output.txt");
		Scanner input = new Scanner(file);
		double temp = 0;
		//Used temp to use number in more than one line of code
		double sum = 0;
		while(input.hasNext()) {
			temp = input.nextDouble();
			sum += temp;
			System.out.println(temp);
		}
		System.out.printf("The total is %.2f", sum);
		input.close();
	}

}

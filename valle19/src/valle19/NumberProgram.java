package valle19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class NumberProgram {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This program makes use of generic types and manipulates an array of integers
	 * Pseudo-Code:
	 * - Create 10 random integers and add them to an array
	 * - Display maximum using max() method.
	 * - Display the sorted array using display() method. (gets sorted in max() method)
	 * - Display total using listAdder() method.
	 */
	public static void main(String[] args) {
		//Creating 10 random numbers and adding them to an integer array
		Random randomGenerator=new Random();
		Integer[] arrints = new Integer[10];
        for (int i = 0; i < 10; i++) {
            arrints[i]=(randomGenerator.nextInt(20) + 1);
        }
        //creating a temporary arraylist because listAdder's parameter is type arraylist
		ArrayList<Integer> arrintslist=new ArrayList<Integer>(Arrays.asList(arrints));
		
		//output
		System.out.printf("Maximum in array is %d\nArray has been sorted\n", max(arrints));
		display(arrints);
		System.out.printf("Total is %.2f", listAdder(arrintslist));
	}
	
	//Method takes array of generic type.  Displays array and number of elements in the array.
	public static <E> void display(E[] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.printf("\nThat array held %d elements\n", list.length);
	}
	//Method takes arraylist of any number type.  Prints each element in array and returns the total.
	public static double listAdder(ArrayList<? extends Number> list) {
		double total = 0;
		if(list.get(0) instanceof Integer || list.get(0) instanceof Byte || list.get(0) instanceof Double) {
			for(Number element: list) {
				System.out.print(element + " ");
				total+=Double.parseDouble(element.toString());
			}
		}
		System.out.print("\n");
	    return total;
	}
	//Method takes array of generic type.  Sorts the list and returns the highest value.
	public static <E extends Comparable<E>> E max(E[] list) {
		E currentMin;
	    int currentMinIndex;
	    for (int i = 0; i < list.length - 1; i++) {
	      // Find the minimum in the list[i..list.length-1]
	      currentMin = list[i];
	      currentMinIndex = i;
	      for (int j = i + 1; j < list.length; j++) {
	        if (currentMin.compareTo(list[j]) > 0) {
	          currentMin = list[j];
	          currentMinIndex = j;
	        }
	      }
	      // Swap list[i] with list[currentMinIndex] if necessary;
	      if (currentMinIndex != i) {
	        list[currentMinIndex] = list[i];
	        list[i] = currentMin;
	      }
	    }
	    return list[list.length-1];
	}
}

package valle20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeMachine {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This program uses Employee objects, Linke d Lists, Iterators, and lambda expressions.
	 * Pseudo-Code:
	 * - Create array of eight employee objects.
	 * - Create an arrayList from the array
	 * - Sort the arrayList by last name then first name
	 * - Using the foreach method and lambda expression, print all employees
	 * - Create a LinkedList from the ArrayList
	 * - Create an iterator that can cycle forwards and backwards through the LinkedList.
	 * - Iterate forward with no output
	 * - Iterate backwards and print names. (reverse alphabetical)
	 */
	public static void main(String[] args) {
		//Create an array of employee objects
		Employee emp1 = new Employee("ID 23232", "Baker", "Amy", 100000);
		Employee emp2 = new Employee("ID 11111", "Scott", "Bob", 65000);
		Employee emp3 = new Employee("ID 45454", "Perez", "Ava", 105000);
		Employee emp4 = new Employee("ID 13579", "Jones", "Pat", 80000);
		Employee emp5 = new Employee("ID 12345", "Baker", "Tom", 200000);
		Employee emp6 = new Employee("ID 56789", "Jones", "Dan", 130000);
		Employee emp7 = new Employee("ID 24680", "Scott", "Ann", 90000);
		Employee emp8 = new Employee("ID 67765", "Jones", "Don", 140000);
		Employee[] array= {emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8};
		
		//Create an arraylist from the array
		ArrayList<Employee> arrayList = new ArrayList<>(Arrays.asList(array));
		//Sort arraylist by last name then first name
		Collections.sort(arrayList, Comparator.comparing(Employee::getLastName).thenComparing(Employee::getFirstName));
		//Used foreach method and lambda expression on toString
		System.out.println("Staff sorted by names\n");
		arrayList.forEach((employee) -> {System.out.println(employee.toString());});
		
		//Create a new linkedlist from the arraylist
		LinkedList<Employee> linkedList = new LinkedList<Employee>();
		arrayList.forEach((employee) -> {linkedList.add(employee);});
		
		//Create a new iterator that goes forwards and backwards, and prints output while going backwards
		ListIterator<Employee> itr=linkedList.listIterator();
		Employee temp;
		while(itr.hasNext()) { //forwards
			temp = itr.next();
		}
		System.out.println("\nStaff sorted Reverse Alpha\n");
		while(itr.hasPrevious()) { //backwards
			temp = itr.previous();
			System.out.println(temp.toString());
		}
	}

}

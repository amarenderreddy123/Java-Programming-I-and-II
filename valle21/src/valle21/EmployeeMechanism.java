package valle21;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeMechanism {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This program uses a TreeMap as well as its foreach method to organize data and display it.
	 * Pseudo-Code:
	 * - Create array of eight employee objects
	 * - Create an arrayList from the array
	 * - Use enhanced for loop to print all employees.
	 * - Create TreeMap that uses Strings for keys and Employees as values.
	 * - Print all employees in ID # order as shown using the TreeMap's forEach method and a lambda expression
	 */
	public static void main(String[] args) {
		//used for getting currency in foreach method
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
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
		
		//enhanced for loop to print all employees AND create a TreeMap that uses Strings for keys and Employees as values
		Map<String, Employee> hashMap = new HashMap<>();
		System.out.println("All Employees\n");
		for(Employee e:arrayList) {
			System.out.println(e.toString());
			hashMap.put(e.getId(), e);
		}
		TreeMap<String, Employee> treeMap = new TreeMap<>(hashMap);
		
		//print all using the TreeMap's forEach method and a lambda expression
		System.out.println("\nEmployees By ID $\n");
		treeMap.forEach(
				(id, employee) -> System.out.printf("%s:%s, %s, salary %s\n", id, employee.getLastName(), employee.getFirstName(), formatter.format(employee.getSalary())));
		
	}

}

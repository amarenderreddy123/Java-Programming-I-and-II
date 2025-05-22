package valle21;

import java.text.NumberFormat;

public class Employee {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  Employee class from previous assignment
	 * Pseudo-Code:
	 * - 4 private attributes
	 * - Constructor with parameters
	 * - 4 getters for each attribute
	 * - toString method used in EmployeeMachine output
	 */
	//attributes
	private String id;
	private String lastName;
	private String firstName;
	private int salary;
	
	//constructor
	public Employee(String id, String lastName, String firstName, int salary) {
		this.id=id;
		this.lastName=lastName;
		this.firstName=firstName;
		this.salary=salary;
	}
	
	//getters
	public String getId() {
		return this.id;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public int getSalary() {
		return this.salary;
	}
	
	//toString method
	public String toString() {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(); //used for currency
		return String.format("%s:%s, %s, salary %s", this.id,this.lastName,this.firstName,formatter.format(this.salary));
	}

}

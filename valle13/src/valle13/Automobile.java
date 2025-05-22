package valle13;

public class Automobile implements Comparable<Object> {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This is a Automobile class used in TestAutos.java
	 * Pseudo-Code:
	 * - Attributes: String make, String model, int year, int price
	 * - 4 args constructor
	 * - 4 getters, one for each attribute
	 * - toString method
	 * - Override compareTo() from the Comparable class. Sort by year.
	 */
	
	//attributes
	private String make;
	private String model;
	private int year;
	private int price;
	
	//constructor
	public Automobile(String make, String model, int year, int price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	//getters
	public String getMake() {return this.make;}
	public String getModel() {return this.model;}
	public int getYear() {return this.year;}
	public int getPrice() {return this.price;}
	
	//toString method
	public String toString() {
		return String.format("Make:%s\tModel:%s\tYear:%d\tPrice:$%d", this.make, this.model, this.year, this.price);
	}
	
	@Override //overriding compareTo() from Comparable
	public int compareTo(Object z) {
		//Have to cast because compareTo needs Object in args
		Automobile temp = (Automobile) z;
		//Sorts by year
		return this.year - temp.year;
	}
}

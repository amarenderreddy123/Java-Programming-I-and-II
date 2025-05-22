package valle13;

import java.util.Date;

public class Reptile extends Pet implements Mobility{
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This is a class that extends Pet and implements Mobility.
	 * Pseudo-Code:
	 * - 1 attributes String type
	 * - 4 arg constructor (3 of the args for superclass)
	 * - Override move() from interface and sound() from superclass
	 * - toString method
	 * - Override compareTo() from Comparable in order to sort by weight
	 */
	
	//attribute
	private String type;
	
	//constructor
	public Reptile(String name, char gender, Date acquired, String type) {
		super(name, gender, acquired);
		this.type = type;
	}
	
	@Override //overriding from interface Mobility
	public String move() {
		return "Must be caged, crawls or slithers";
	}
	
	@Override //overriding from superclass Pet
	public String sound() {
		return "Not much sound, maybe a hiss";
	}
	
	//toString method
	public String toString() {
		return String.format("Reptile name = %s, %s, %s\n%s\n%s, acquired %s",this.name,this.type,this.gender,move(),sound(),this.acquired.toString());
	}
}

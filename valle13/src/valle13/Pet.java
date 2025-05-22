package valle13;

import java.util.Date;

public abstract class Pet {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This is a abtract superclass of Dog and Reptile.  It is abstract because all Pet objects will have sound().
	 * Pseudo-Code:
	 * - 3 attributes, String name, char gender, Date acquired.
	 * - 3 arg constructor.
	 * - 3 getters
	 * - 1 abstract method String sound();
	 */
	
	//attributes
	protected String name;
	protected char gender;
	protected Date acquired;
	
	//constructor
	public Pet(String name, char gender, Date acquired) {
		this.name = name;
		this.gender = gender;
		this.acquired = acquired;
	}
	
	//getters
	public String getName() {return this.name;}
	public char getGender() {return this.gender;}
	public Date getAcquired() {return this.acquired;}
	
	//abstract method sound()
	public abstract String sound();
}

package valle13;

import java.util.Date;

public class Dog extends Pet implements Mobility, Comparable<Object> {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This is a class that extends Pet and implements Mobility and Comparable.
	 * Pseudo-Code:
	 * - 2 attributes String breed, int weight
	 * - 5 arg constructor (3 of the args for superclass)
	 * - 2 getters for breed and weight
	 * - Override move() from interface and sound() from superclass
	 * - toString method
	 * - Override compareTo() from Comparable in order to sort by weight
	 */
	
	//attributes
	private String breed;
	private int weight;
	
	//constructor
	public Dog(String name, char gender, Date acquired, String breed, int weight) {
		super(name, gender, acquired);
		this.breed = breed;
		this.weight = weight;
	}
	
	//getters
	public String getBreed() {return this.breed;}
	public int getWeight() {return this.weight;}
	
	@Override //overriding from interface Mobility
	public String move() {
		return "Walks on a leash";
	}
	@Override //overriding from superclass Pet
	public String sound() {
		return "Barks or howls";
	}
	//toString method
	public String toString() {
		return String.format("Dog name = %s, %s, %s\n%s, weight %d\n%s, acquired %s",this.name,this.breed,this.gender,move(),this.weight,sound(),this.acquired.toString());
	}
	
	@Override //overriding compareTo() from Comparable
	public int compareTo(Object doggy) {
		//Have to cast because compareTo needs Object in args
		Dog temp = (Dog) doggy;
		//sorts by weight
		return this.weight - temp.weight;
	}
	
}

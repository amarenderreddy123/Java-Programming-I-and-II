package valle11;

public class Ship{
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This is a superclass.
	 */
	protected String name;
	protected int year;
	protected boolean isAfloat;
	public Ship(String name, int year, boolean isAfloat) {
		this.name=name;
		this.year=year;
		this.isAfloat=isAfloat;
	}
	public boolean isAfloat() {
		return this.isAfloat;
	}
	public void setAfloat(boolean isAfloat) {
		this.isAfloat=isAfloat;
	}
	public String getName() {
		return this.name;
	}
	public int getYear() {
		return this.year;
	}
	public String toString() {
		return String.format("Ship name:%s, year launched: %d, is afloat: %b", this.name, this.year, this.isAfloat) ;
	}
	
}
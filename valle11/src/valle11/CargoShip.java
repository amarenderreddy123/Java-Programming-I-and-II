package valle11;

public class CargoShip extends Ship{
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This is a subclass.
	 */
	private String cargo;
	private int capacity;
	public CargoShip(String name, int year, boolean isAfloat, String cargo, int capacity) {
		super(name, year, isAfloat);
		this.cargo=cargo;
		this.capacity=capacity;
	}
	public int getCapacity() {
		return this.capacity;
	}
	public String toString() {
		return String.format("Ship name:%s, year launched: %d, is afloat: %b\nCapacity of %s is %d\n", this.name, this.year, this.isAfloat, this.cargo, this.capacity);
	}
}

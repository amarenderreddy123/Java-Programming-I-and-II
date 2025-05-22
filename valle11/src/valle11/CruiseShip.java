package valle11;

public class CruiseShip extends Ship{
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This is a subclass.
	 */
	private int passengers;
	private String zone;
	public CruiseShip(String name, int year, boolean isAfloat, int passengers, String zone) {
		super(name, year, isAfloat);
		this.passengers=passengers;
		this.zone=zone;
	}
	public int getPassengers() {
		return this.passengers;
	}
	public String getZone() {
		return this.zone;
	}
	public String toString() {
		return String.format("Ship name:%s, year launched: %d, is afloat: %b\n%d passenger capacity, operating in the %s\n", this.name, this.year, this.isAfloat, this.passengers, this.zone);
	}
}

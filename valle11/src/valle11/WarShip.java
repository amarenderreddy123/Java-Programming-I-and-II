package valle11;

public class WarShip extends Ship{
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This is a subclass.
	 */
	private String type;
	private String nation;
	public WarShip(String name, int year, boolean isAfloat, String type, String nation) {
		super(name, year, isAfloat);
		this.type=type;
		this.nation=nation;
	}
	public String toString() {
		return String.format("Ship name:%s, year launched: %d, is afloat: %b\nType: %s, operated by %s\n", this.name, this.year, this.isAfloat, this.type, this.nation);
	}
}

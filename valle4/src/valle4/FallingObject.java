package valle4;

public class FallingObject {

	public static void main(String[] args) {
		System.out.printf("%-6s\t%-6s\t%8s\n", "SEC", "METERS", "FEET");
		for(int i=1; i<11;i++) {
			System.out.printf("%-6d\t%6.1f\t%8.1f\n", i, returnDistance(i), metersToFeet(returnDistance(i)));
		}
	}
	public static double returnDistance(int seconds) {
		double meters=0;
		meters=(0.5)*(9.8)*(seconds*seconds);
		return meters;
	}
	public static double metersToFeet(double meters){
		final double CONVERSION_RATE = 3.28084;
		double feet=meters*(CONVERSION_RATE);
		return feet;
	}
}

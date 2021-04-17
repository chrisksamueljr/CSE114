package Lab_14;


// 3.14159
// 2.0
// 4.0
// 12.56636
// 4.0
// 0
// 0.0
public class Circle {
	private double radius = 1; 
	private String color; // Default: null

	static int count;  // default: 0
	private char c; //default: \u0000
	private boolean isFilled; // default: false

	public Circle() {
		color = "Red";
		count++;
	}

	// Constructors
	public Circle(double radius) {
		this();
		this.radius = radius;
	}
	public double getArea() {
		return radius * radius * 3.14159;
	}
	
	public double getDiameter() {
		return 2 * radius;
	}

	public static double getCount() {
		return count;
	}

	public double getRadius() {
		return 2 * radius;
	}

	public void setRadius(double newRadius) {	
		// modifiers

	}

}

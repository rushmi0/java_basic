
public class Circle {

	private double ridius;
	private String color;

	public Circle(double ridius, String color) {
		this.ridius = ridius;
		this.color = color;
	}

	public Circle(double ridius) {
		this(ridius, null);
	}

	public Circle() {
		this(0, null);
	}

	public double getRadius() {
		return this.ridius;
	}

	public String getColor() {
		return this.color;
	}

	public double getArea() {
		return Math.PI * ridius * ridius;
	}

	public String tosString() {
		return "radius= " + getArea();
	}

}

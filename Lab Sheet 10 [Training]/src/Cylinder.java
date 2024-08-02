
public class Cylinder extends Circle {
	private double heigth;

	public Cylinder(double redius, String color, double heigth) {
		super(redius, color);
		this.heigth = heigth;
	}

	public Cylinder(double redius, double heigth) {
		super(redius);
		this.heigth = heigth;
	}

	public Cylinder() {
		this(0, null, 0);
	}

	public double getHeigth() {
		return this.heigth;
	}

	public double getVolume() {
		return getArea() * heigth;
	}

	public double getArea() {
		return 2 * Math.PI * (heigth);
	}

}

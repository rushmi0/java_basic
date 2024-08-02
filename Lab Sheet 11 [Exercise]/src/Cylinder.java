
public class Cylinder extends Circle {

	private double heigth;

	public Cylinder(double radius, double heigth) {
		super(radius, null);
		this.heigth = heigth;
	}

	public double getHeigth() {
		return this.heigth;
	}

	public double getVolume() {
		return super.getArea() * heigth;
	}

	public double getArea() {
		return 2 * Math.PI * (heigth * super.getRadius());
	}

	public String toString() {
		return "heigth=" + this.heigth + "," + super.toString();
	}

}

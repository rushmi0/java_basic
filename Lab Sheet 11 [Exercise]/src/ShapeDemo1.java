import java.util.Scanner;

public class ShapeDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input radius : ");
		double radius = sc.nextDouble();
		System.out.print("Input height : ");
		double height = sc.nextDouble();

		Circle circle = new Circle(radius, null);
		Cylinder cylinder = new Cylinder(radius, height);

		System.out.println();
		System.out.println("Circle[area=" + circle.getRadius() + "]");
		System.out.println("Circle[area=" + circle.getArea() + "]");
		System.out.println();
		System.out.println("Cylinder[height=" + cylinder.getHeigth() + ",radius=" + cylinder.getRadius() + "]");
		System.out.println("Cylinder[area=" + cylinder.getArea() + "]");
		System.out.println("Cylinder[volume=" + cylinder.getVolume() + "]");

	}

}

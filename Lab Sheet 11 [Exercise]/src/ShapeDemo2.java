import java.util.Scanner;

public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Cylinder cylinder[] = new Cylinder[5];

		for (int i = 0; i < cylinder.length; i++) {
			System.out.print("Input radius and height : ");
			double radius = sc.nextDouble();
			double height = sc.nextDouble();
			cylinder[i] = new Cylinder(radius, height);
		}
		System.out.println();
		int i = 0;
		for (Cylinder _cylinder : cylinder) {
			System.out.println("Cylinder " + (i + 1) + ", volume=" + _cylinder.getVolume());
			i++;
		}
	}

}

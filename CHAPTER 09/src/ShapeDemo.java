//2013111089 ÇÑªÃ¾Å ¾§ÉìÇÔÅÑÂ
public class ShapeDemo {

	public static void main(String[] args) {

		Shape shape = new Rectangle(4, 5, "red");

		System.out.println(shape + " Area is " + shape.getArea());

		shape = new Triangle(4, 5, "blue");
		System.out.println(shape + " Area is " + shape.getArea());

	}

}

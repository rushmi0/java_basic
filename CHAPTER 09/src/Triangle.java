//2013111089 วัชรพล พงษ์วิลัย
public class Triangle extends Shape {

	private int base, height;

	public Triangle(int base, int height, String color) {
		super(color);
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return 1.0 / 2.0 * this.height * this.base;
	}

	@Override
	public String toString() {
		return "Triangle[base=" + this.base + "height=" + this.height + "," + 
	"Shape[" + super.toString()/*ถ้าใช้this.toString()จะใช้ตัวของตัวเองแต่ตัวเองไม่มีเราต้องเอาจากคลาสแม่มาใช้*/ + "]]";
	}

}

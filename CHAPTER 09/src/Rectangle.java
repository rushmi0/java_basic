//2013111089 วัชรพล พงษ์วิลัย
public class Rectangle extends Shape {

	private int length, width;

	public Rectangle(int length/*int lenght th กับ ht สลับกัน*/, int width, String color) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return this.length * this.width;
	}

	@Override
	public String toString() {
		return "Rectangle[length=" + this.length + "width=" + this.width + 
				"," + "Shape[" + super.toString()/*ถ้าใช้this.toString()จะใช้ตัวของตัวเองแต่ตัวเองไม่มีเราต้องเอาจากคลาสแม่มาใช้*/ + "]]";
	}

}

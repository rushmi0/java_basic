//2013111089 �Ѫþ� ���������
public class Rectangle extends Shape {

	private int length, width;

	public Rectangle(int length/*int lenght th �Ѻ ht ��Ѻ�ѹ*/, int width, String color) {
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
				"," + "Shape[" + super.toString()/*�����this.toString()�����Ǣͧ����ͧ�����ͧ�������ҵ�ͧ��Ҩҡ�����������*/ + "]]";
	}

}

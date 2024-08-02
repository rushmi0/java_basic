
public class Example1 {

	public static void main(String[] args) {
		String ISBN = "IB2-6325-85-4-1";
		String title = "Basic Java Programming";
		int unit = 5;
		float price = 225.75f;
		
		System.out.println("Book ISBN  : " + ISBN);
		System.out.println("Book Title : " + title);
		System.out.println("Book Unit  : " + unit);
		System.out.println("Book Price : " + price);
		System.out.println("---------------------------------------------------");
		
		float total = price * unit;
		System.out.println("Total price is " + total);
		System.out.println("Add VAT 7%  is " + (total + (total * 7 / 100)));
	}

}

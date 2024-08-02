import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab205 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat fr = new DecimalFormat("##,###.00");

		System.out.print("Input Product Name    : ");
		String name = sc.nextLine();
		System.out.print("Input Product Unit    : ");
		int unit = sc.nextInt();
		System.out.print("Input Price per unit  : ");
		float price = sc.nextFloat();
		System.out.println("-----------------------------------------------");
		float total = unit * price;
		System.out.print("Total Price is " + fr.format(total) + "baht.");
		System.out.println("\n-----------------------------------------------");
		System.out.print("How many discount (%) : ");
		int discount = sc.nextInt();
		System.out.println("-----------------------------------------------");
		System.out.println("Discount from        " + discount + "%" + fr.format(total * discount / 100f) + " baht.");
		System.out.println("Amount to be paid    " + fr.format(total - (total * discount / 100f)) + " baht.");

	}

}

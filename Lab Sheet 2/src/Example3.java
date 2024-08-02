import java.util.Scanner;
import java.text.DecimalFormat;
public class Example3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input product name   : ");
		String name = scan.nextLine();
		
		System.out.print("Input product unit   : ");
		int unit = scan.nextInt();
		
		System.out.print("Input price per unit : ");
		float price = scan.nextFloat();
		
		System.out.println();
		
		float total = unit * price; 
		System.out.println("Total Price is " + frm.format(total) + " baht.");
		
		System.out.println("Add VAT 7%  is " + 
						   frm.format(total + (total * 7 / 100)) + " baht.");

	}

}

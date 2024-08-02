import java.text.DecimalFormat;
public class Example2 {

	public static void main(String[] args) {
		
       DecimalFormat frm = new DecimalFormat("#,###.00");
		
		final float buffet = 299;
		int customer = 5;
		
		float total = buffet * customer;

		System.out.println("Buffet of " + customer + 
				           " customers is " + frm.format(total));
		
		System.out.println("Add Service Charge 3% is " +
						   frm.format(total + (total * 3/100)) );

	}

}

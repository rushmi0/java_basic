import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Example4 { 

	public static void main(String[] args) {
		
        DecimalFormat frm = new DecimalFormat("#,###.00");
        		
		
		String name = JOptionPane.showInputDialog("Input product name:");
		
		int unit = Integer.parseInt(
				   JOptionPane.showInputDialog("Input product unit:")); 
		
		float price = Float.parseFloat(
				      JOptionPane.showInputDialog("Input price per unit:"));
		
		float total = price * unit;
		JOptionPane.showMessageDialog(null, "Total Price is " +
							frm.format(total) + " baht." +
							"\nAdd VAT 7% is " + 
							frm.format(total+(total * 7 / 100)) + " baht.");
	}

}

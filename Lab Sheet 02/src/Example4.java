import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Example4 {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Input product name:");

		DecimalFormat fr = new DecimalFormat("#,###.00");

		int unit = Integer.parseInt(JOptionPane.showInputDialog("Input product unit:"));

		float price = Float.parseFloat(JOptionPane.showInputDialog("Input price per unit:"));

		float total = unit * price;

		JOptionPane.showMessageDialog(null, "Total Price is " + fr.format(total) + " baht." + "\nAdd VAT 7% is "
				+ fr.format(total + (total * 7 / 100)) + " baht.");

	}

}

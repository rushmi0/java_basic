import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Lab301 {

	public static void main(String[] args) {

		DecimalFormat fr = new DecimalFormat("#,###.00");
		int customer = Integer.parseInt(JOptionPane.showInputDialog("How many customber per bill?"));
		int total = 299 * customer;
		int button = 2;
		while (button == 2) {
			button = JOptionPane.showConfirmDialog(null,
					"Total Price is " + fr.format(total) + " baht." + "\nDo You have a member card?");
		}
		if (button == 0) {
			int member = total - (total * 10 / 100);
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + fr.format(member) + " baht.");
		} else if (button == 1) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + fr.format(total) + " baht.");
		}

	}

}

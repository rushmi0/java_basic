import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;

public class Lab304 {

	public static void main(String[] args) {

		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		DecimalFormat fr = new DecimalFormat("###,###");
		int withdraw = Integer.parseInt(
				JOptionPane.showInputDialog("Your balance : " + fr.format(balance) + "\nInput money to withdraw:"));
		int balance1 = 0;
		if (withdraw % 100 != 0) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw " + withdraw % 100 + " baht.", "ERROR",
					JOptionPane.ERROR_MESSAGE);
		} else if (withdraw < 20000) {
			int unit = withdraw / 1000;
			int value = unit * 1000;

			int withdraw1 = withdraw - value;
			int unit1 = withdraw1 / 500;
			int value1 = unit1 * 500;

			int withdraw2 = withdraw1 - value1;
			int unit2 = withdraw2 / 100;
			int value2 = unit2 * 100;
			balance1 = value - value1 - value2;

			JOptionPane.showMessageDialog(null, "You withdraw " + fr.format(withdraw) + " baht." + "\n1,000 = " + unit
					+ "\n500 = " + unit1 + "\n100 = " + unit2);
		} else if (withdraw > balance) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance", "ERROR",
					JOptionPane.ERROR_MESSAGE);
		} else if (withdraw > 20000) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000", "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}

	}

}

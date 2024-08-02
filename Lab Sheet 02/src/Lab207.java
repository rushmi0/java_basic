import javax.swing.JOptionPane;

public final class Lab207 {

	public static void main(String[] args) {
		int small = 30, big = 60;

		int unit1 = Integer.parseInt(JOptionPane.showInputDialog("How many small dish:"));
		int total1 = small * unit1;

		int unit2 = Integer.parseInt(JOptionPane.showInputDialog("How many big dish:"));
		int total2 = big * unit2;
		int paid = total1 + total2;

		JOptionPane.showInputDialog(
				null, "You order " + unit1 + " small dish " + (total1) + "\nYou order " + unit2 + " big dish "
						+ (total2) + "\nAmount to be paid is " + paid + " baht.",
				"Noodles", JOptionPane.WARNING_MESSAGE);

	}

}

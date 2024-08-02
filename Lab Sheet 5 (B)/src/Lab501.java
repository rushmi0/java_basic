import javax.swing.JOptionPane;

public class Lab501 {

	public static void main(String[] args) {

		while (true) {
			double Widht = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Widht:"));
			double Length = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Length:"));
			double wl = Widht * Length, r = (2 * (Widht + Length));
			JOptionPane.showMessageDialog(null, "Area is " + wl + "\nRoun is " + r);

			JOptionPane.showConfirmDialog(null, "Do you want to input Widht and Length again?");
			int con = 0;
			if (con == 0) {
				continue;
			} else {
				JOptionPane.showMessageDialog(null, "End Process");
			}

		}
	}

}

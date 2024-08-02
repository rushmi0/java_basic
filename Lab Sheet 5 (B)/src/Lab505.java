import javax.swing.JOptionPane;

public class Lab505 {

	public static void main(String[] args) {

		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a naumber:"));
		JOptionPane.showMessageDialog(null, checkNumber(number));

	}

	public static String checkNumber(int num) {

		String nik;

		if (num > 0) {
			nik = ("The number " + "(" + num + ")" + " is  Positive");
		}

		else if (num < 0) {
			nik = ("The number " + "(" + num + ")" + " is Negative");
		}

		else {
			nik = ("The number " + "(" + num + ")" + " is Zero");
		}
		return nik;
	}
}

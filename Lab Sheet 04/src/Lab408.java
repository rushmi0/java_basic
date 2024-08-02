import javax.swing.JOptionPane;

public class Lab408 {

	public static void main(String[] args) {

		String email = JOptionPane.showInputDialog("Input your email:");
		boolean check = checkEmail(email);
		while (!check) {
			email = JOptionPane.showInputDialog("Input your email,again:");
			check = checkEmail(email);
			if (check == true) {
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "Your e-mail is " + email.toLowerCase());
	}

	public static boolean checkEmail(String email) {
		String nmail = email.toLowerCase();
		if (!nmail.contains(" ") && nmail.endsWith("@hotmail.com") || nmail.endsWith("@gmail.com")) {
			return true;
		} else {
			return false;
		}

	}

}

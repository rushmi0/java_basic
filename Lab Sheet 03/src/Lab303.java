import javax.swing.JOptionPane;

public class Lab303 {

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Input a number:"));
		// condition ? "True statement":"False statement"
		JOptionPane.showMessageDialog(null, " " + num + (num % 2 == 0 ? " is Even number." : " is Odd number."));
		int button = JOptionPane.showConfirmDialog(null, "Do you want to input a number again?", "Question Message",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		while (button == JOptionPane.YES_OPTION) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Input a number:"));
		}

	}

}

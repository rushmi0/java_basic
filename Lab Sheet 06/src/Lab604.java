import javax.swing.JOptionPane;

public class Lab604 {

	public static void main(String[] args) {

		String[] word = { "Good Morning", "Good Afternoon", "Good Evening", "Good Night" };
		String msg = "The greeting words in English:\n";
		
		for (String _word : word) {
			msg += _word + "\n- ";
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}

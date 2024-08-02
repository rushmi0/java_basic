import javax.swing.JOptionPane;

public class Example1 {

	public static void main(String[] args) {

		int button = 2;
		while (button == 2) {
			button = JOptionPane.showConfirmDialog(null, "Please click any botton", "Click Button",
					JOptionPane.YES_NO_CANCEL_OPTION);
		}
		if (button == 0) { // if (button == JOptionpane.YES.OPTION)
			JOptionPane.showMessageDialog(null, "You cilcked YES button");
		} else if (button == 1) {
			JOptionPane.showMessageDialog(null, "You cilcked NO button");
		} else {
			JOptionPane.showMessageDialog(null, "You cilcked CANCEL button");
		}

	}

}

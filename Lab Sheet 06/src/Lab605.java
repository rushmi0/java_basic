import javax.swing.JOptionPane;

public class Lab605 {

	public static void main(String[] args) {

		int[] number = new int[5];
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i + 1) + " : "));
		}
		showEven(number);
		showOdd(number);
	}

	public static void showEven(int[] nums) {
		String msg = "List of even numbr:\n";
		for (int _nums : nums) {
			if (_nums % 2 == 0) {
				msg += _nums + " ";
			}
		}
		JOptionPane.showMessageDialog(null, msg);

	}

	public static void showOdd(int[] nums) {
		String msg = "List of odd number:\n";
		for (int _nums : nums) {
			if (_nums % 2 == 1) {
				msg += _nums + " ";
			}
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}

import javax.swing.JOptionPane;

public class Lab209 {

	public static void main(String[] args) {

		int time_hour = 50;
		float time_minute = 0.25f;
		int minute = Integer.parseInt(JOptionPane.showInputDialog("Input Time Parking(minute):"));
		int hour = minute / 60;
		int minute1 = hour * 60;
		int minute2 = minute - minute1;
		int rate_hour = hour * time_hour;
		float rate_minute = minute2 * time_minute;
		float amount = rate_hour + rate_minute;

		JOptionPane.showMessageDialog(null, "You parking " + hour + " Hour " + minute2 + " Minute."
				+ "\nAmount to be paid is " + amount + " Baht.");

	}

}

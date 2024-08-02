import javax.swing.JOptionPane;

public class Lab208 {

	public static void main(String[] args) {

		int coupon_smoky_bike = 1000, coupon_hamburger = 600, coupon_choco_stick = 100;
		int point = Integer.parseInt(JOptionPane.showInputDialog("Input your point:"));

		int unit = point / coupon_smoky_bike;
		int value = unit * coupon_smoky_bike;

		int point1 = point - value;
		int unit1 = point1 / coupon_hamburger;
		int value1 = unit1 * coupon_hamburger;

		int point2 = point1 - value1;
		int unit2 = point2 / coupon_choco_stick;
		int value2 = unit2 * coupon_choco_stick;

		int balance = point - value - value1 - value2;

		JOptionPane.showMessageDialog(null,
				"Your Point : " + point + ", You can exchange..." + "\n " + unit + " of SMOKYBIKE COUPON" + "\n "
						+ unit1 + " of HAMBURGER COUPON" + "\n " + unit2 + " of CHOCO STICK COUPON" + "\n"
						+ "\n Point Balance : " + balance);

	}

}

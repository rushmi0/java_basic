import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Lab302 {

	public static void main(String[] args) {

		DecimalFormat fr = new DecimalFormat("00.0");
		float weight = Float.parseFloat(JOptionPane.showInputDialog("Input Weight:"));
		int height = Integer.parseInt(JOptionPane.showInputDialog("Input Height:"));
		float height1 = (float) height / 100;
		double bmi = weight / (height1 * height1);
		if (bmi < 18.5) {
			JOptionPane.showMessageDialog(null, "BMI = " + fr.format(bmi) + "\nYou're Underweight", "BMI",
					JOptionPane.WARNING_MESSAGE);
		} else if (bmi < 24.9) {
			JOptionPane.showMessageDialog(null, "BMI = " + fr.format(bmi) + "\nYou're Normail-weight", "BMI",
					JOptionPane.WARNING_MESSAGE);
		} else if (bmi < 29.9) {
			JOptionPane.showMessageDialog(null, "BMI = " + fr.format(bmi) + "\nYou're Overweight", "BMI",
					JOptionPane.WARNING_MESSAGE);
		} else if (bmi > 30.0) {
			JOptionPane.showMessageDialog(null, "BMI = " + fr.format(bmi) + "\nYou're Obesity", "BMI",
					JOptionPane.WARNING_MESSAGE);
		}

	}

}

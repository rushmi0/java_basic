import javax.swing.JOptionPane;
public class ShapeDemo3 {

	public static void main(String[] args) {

		String msg = " ";
		Cylinder cylinder[] = new Cylinder[5];
		for (int i = 0; i < cylinder.length; i++) {
			System.out.print("Input radius and height : ");
			double radius = Double.parseDouble(JOptionPane.showInputDialog("Input radius: "));
			double height = Double.parseDouble(JOptionPane.showInputDialog("Input height: "));
			cylinder[i] = new Cylinder(radius, height);
			msg += "Cylinder " + (i + 1) + ", volume=" + cylinder[i].getVolume() + "\n";
		}

		JOptionPane.showMessageDialog(null, msg);
	}

}

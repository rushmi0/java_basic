import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Lab203 {

	public static void main(String[] args) {
		

		DecimalFormat fr = new DecimalFormat(".###");
		float radius = 4.2f;
		double area = Math.PI * Math.pow(radius, 2);
		JOptionPane.showMessageDialog(null, 
									"Circle Area is "+fr.format(area)+
									"\nCircumference is "+fr.format(2 * Math.PI * radius));
	}

}

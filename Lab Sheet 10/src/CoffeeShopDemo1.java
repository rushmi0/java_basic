//2013111089 ÇÑªÃ¾Å ¾§ÉìÇÔÅÑÂ
import javax.swing.JOptionPane;

public class CoffeeShopDemo1 {

	public static void main(String[] args) {

		Barista staff1 = new Barista("Leon", 'M');
		Barista staff2 = new Barista("Claire", 'F');

		int type = Integer.parseInt(JOptionPane.showInputDialog("Input typeCoffee name:"));
		int typeCoffee = Integer.parseInt(JOptionPane.showInputDialog("Input typeCoffee price"));
		
		char sizeCoffee = JOptionPane.showInputDialog("Input sizeCoffee name:").charAt(0);
		int barista = Integer.parseInt(JOptionPane.showInputDialog("Input barista:"));

		if (barista == 1) {
			Coffee order = new Coffee(type, sizeCoffee, typeCoffee, staff1);
			JOptionPane.showMessageDialog(null,
					order.toString() + "\nThe Barista is " + staff1.getName() + " (" + staff1.getGenderName() + ")");
		} else if (barista == 2) {
			Coffee order = new Coffee(type, sizeCoffee, typeCoffee, staff2);
			JOptionPane.showMessageDialog(null,
					order.toString() + "\nThe Barista is " + staff2.getName() + " (" + staff2.getGenderName() + ")");
		}
	}

}

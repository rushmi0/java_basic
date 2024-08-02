//2013111089 ÇÑªÃ¾Å ¾§ÉìÇÔÅÑÂ
import javax.swing.JOptionPane;

public class CoffeeShopDemo2 {

	public static void main(String[] args) {

		Barista staff1 = new Barista("Leon", 'M');
		Barista staff2 = new Barista("Claire", 'F');

		int type, typeCoffee, barista, TotalPrice = 0;
		char sizeCoffee;
		String msg = "";
		int option = 0;

		while (option == 0) {
			
			type = Integer.parseInt(JOptionPane.showInputDialog("TypeCoffee name:"));
			while (type != 1 && type != 2) {
				 Integer.parseInt(JOptionPane.showInputDialog("TypeCoffee name:"));
			}

			do {
				typeCoffee = Integer.parseInt(JOptionPane.showInputDialog("TypeCoffee price"));
			} while (typeCoffee != 1 && typeCoffee != 2 && typeCoffee != 3);

			do {
				sizeCoffee = JOptionPane.showInputDialog("SizeCoffee name:").charAt(0);
			} while (Character.toLowerCase(sizeCoffee) != 't' && Character.toLowerCase(sizeCoffee) != 'g'
					&& Character.toLowerCase(sizeCoffee) != 'v' && Character.toLowerCase(sizeCoffee) != 's');

			barista = Integer.parseInt(JOptionPane.showInputDialog("Barista:"));

			Coffee order;
			if (barista == 1) {
				order = new Coffee(type, sizeCoffee, typeCoffee, staff1);
			} else if (barista == 2) {
				order = new Coffee(type, sizeCoffee, typeCoffee, staff2);
			} else {
				order = new Coffee(type, sizeCoffee, typeCoffee, staff1);
			}
			TotalPrice += order.getTotalPrice();
			msg += "[" + order.getBarista().getName() + "] " + order + "\n";
			option = JOptionPane.showConfirmDialog(null, "Do you want more?", "Coffee Shop", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
		}
		JOptionPane.showMessageDialog(null, msg + "The Total price is " + TotalPrice + " baht.");

	}

}

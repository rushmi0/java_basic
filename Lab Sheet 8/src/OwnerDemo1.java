import javax.swing.JOptionPane;
public class OwnerDemo1 {

	public static void main(String[] args) {
		Owner on = new Owner();
	String name = JOptionPane.showInputDialog(null,"Input owner name:");
	String email = JOptionPane.showInputDialog(null,"Input owner e-mail:");
	int birthyear = Integer.parseInt(JOptionPane.showInputDialog(null,"Input birth year:"));

	on = new Owner(name,email,birthyear);
	JOptionPane.showInternalMessageDialog(null, on);
	}

}

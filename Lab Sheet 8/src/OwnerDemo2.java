import javax.swing.JOptionPane;
public class OwnerDemo2 {

	public static void main(String[] args) {
		Owner owner = new Owner();
		Pet pet = new Pet();
		String email ="";
		
		pet.setName(JOptionPane.showInputDialog(null,"Input Pet Name:"));
		pet.setGender(JOptionPane.showInputDialog(null,"Input Pet Gender:").charAt(0));
		pet.setBirthyear(Integer.parseInt(JOptionPane.showInputDialog(null,"Input Pet Birth year:")));
		
		String name = JOptionPane.showInputDialog(null, "Input owner name:");
		int check = JOptionPane.showConfirmDialog(null, "Cojld you give us an e-mail?" , "Ask e-mail", JOptionPane.YES_NO_OPTION);
		if(check ==0) {
			email = JOptionPane.showInputDialog(null, "Input ower e-mail:");
		}
		int birthyear = Integer.parseInt(JOptionPane.showInputDialog(null,"Input Pet Birth year:"));
		owner = new Owner(name,email,birthyear);
		
		if(owner.getAge() <  20) {
			JOptionPane.showMessageDialog(null, "Please, come again with your parent","Warning",JOptionPane.WARNING_MESSAGE);
		}
		else
			JOptionPane.showMessageDialog(null, pet.toString()+"\n"+owner.toString());
	}

}

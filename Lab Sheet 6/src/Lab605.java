import javax.swing.JOptionPane;
public class Lab605 {
	public static void main(String[] args) {
		
		int[] nub = new int[5];
		for(int i =0;i<nub.length;i++) {
			 nub[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Input number "+(i+1)+":"));
		}		
		showEven(nub);
		showOdd(nub);
	}	
	public static  void showEven(int[] nums) {
		
		String mess = "";
		for(int _nums : nums) {
			if(_nums%2==0) {
				mess += _nums +" ";
			}
		}
		 JOptionPane.showMessageDialog(null, "List even number: "+"\n"+mess);		
	}	
    public static void showOdd(int[] nums) {
		
    	String mess = "";
		for(int _nums : nums) {
			if(_nums%2!=0) {
				mess += _nums +" ";
			}
		}		 
		 JOptionPane.showMessageDialog(null, "List even number: "+"\n"+mess);		
	}
}

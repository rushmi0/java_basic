import java.util.Scanner;
public class Lab403 {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		System.out.print("Input some sentence : "); 
		String sim = sn.nextLine();
		
		while (!sim.endsWith(".")) {
			
			System.out.print("The sentence must be end with full stop point : ");
			 sim = sn.nextLine();
		}
		
		for(int i = 0; i < sim.length();i++) {
			 char mik =  sim.charAt(i);
			 System.out.print(mik);
			 if(mik == ' ') 
			 {
				System.out.println();
			 }
		}
	}

}

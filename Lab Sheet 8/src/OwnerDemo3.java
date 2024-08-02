import java.util.Scanner;
public class OwnerDemo3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many owner to input  : ");
		int n = sc.nextInt();
		System.out.println();
		
		Pet[] pet = new Pet[n];		
		Owner[] owner = new Owner[n];
		
		for(int i = 0; i<pet.length; i++) {
			
			System.out.print("Input your pet name : ");
			String name = sc.next();
			
			System.out.print("Input owner name : ");
			String ownername = sc.nextLine();
			sc.nextLine();
			System.out.print("Input owner e-mail : ");
			String email = sc.next();
			System.out.println("------------------------------------");
			
			pet[i]  =  new Pet() ;
			pet[i].setName(name);
			owner[i] = new Owner(ownername,email,0);
									
		}
		System.out.println();
		
		for(int i = 0;i < n  ;i++) {
			System.out.println((i+1)+". "+pet[i].getName()+"'s "+"owner is "+ owner[i].getName()+"("+owner[i].getEmail()+")");
		}

	}

}

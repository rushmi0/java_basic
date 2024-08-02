import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a message : ");
		String message = scan.nextLine();
		
		boolean check = false;
		for(int i = 0; i < message.length(); i++) {
			char letter = message.charAt(i);
			
			if(!Character.isLetterOrDigit(letter) && letter != ' ') {
				check = true;
				break;
			}
		}
		System.out.print("This sentence " + 
		(check ?"contains" : "has no") +
		" special chracters.");

	}

}

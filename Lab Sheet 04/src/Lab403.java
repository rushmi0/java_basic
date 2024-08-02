import java.util.Scanner;

public class Lab403 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String message = sn.nextLine();
		while (!message.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			message = sn.nextLine();
		}
		System.out.println();
		for (int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i));
			if (message.charAt(i) == (' ')) {
				System.out.println("");
			}
		}

	}

}

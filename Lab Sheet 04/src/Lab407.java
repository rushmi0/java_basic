import java.util.Scanner;

public class Lab407 {

	public static void main(String[] args) {

		Scanner ss = new Scanner(System.in);
		System.out.print("Input some message : ");
		String message = ss.nextLine();
		System.out.println();
		System.out.println("This message have " + countLetter(message) + " letters:");
		showLetter(message);

	}

	public static int countLetter(String msg) {
		int count = 0;
		for (int i = 0; i < msg.length(); i++) {
			char message = msg.charAt(i);
			if (Character.isLetter(message) == true) {
				count++;
			}
		}
		return count;
	}

	public static void showLetter(String msg) {
		for (int i = 0; i < msg.length(); i++) {
			char message = msg.charAt(i);
			if (Character.isLetter(message) == true) {
				System.out.print(msg.charAt(i) + " ");
			}
		}
	}

}

import java.util.Scanner;

public class Lab401 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input full name : ");
		String fullname = sc.nextLine();

		System.out.println();
		if (!fullname.startsWith(" ") && !fullname.endsWith(" ")) {
			System.out.println("First name = " + fullname.substring(0, fullname.indexOf(" ")));
			System.out.println("Last  name = " + fullname.substring(fullname.indexOf(" ") + 1));
		} else {
			System.out.println("You input name in wrong format.");
		}

	}

}

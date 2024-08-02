import java.util.Scanner;

public class Lab406 {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		System.out.print("Input full name : ");
		String fullname = sr.next();
		String lastname = sr.next();
		System.out.println();
		System.out.println("Your TNI Mail is " + createTNIMail(fullname, lastname));

	}

	public static String createTNIMail(String fullname, String lastname) {
		String email = lastname.toLowerCase().substring(0, 2) + "." + fullname.toLowerCase() + "_st@tni.ac.th";
		return email;

	}

}

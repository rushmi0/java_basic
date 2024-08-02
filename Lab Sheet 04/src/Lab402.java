import java.util.Scanner;

public class Lab402 {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);
		System.out.print("Input full name : ");
		String fullname = sa.next();
		String lastname = sa.next();
		System.out.println();
		System.out.println("Show name in format = " + lastname.toUpperCase().charAt(0) + "." + fullname.toUpperCase());

	}

}

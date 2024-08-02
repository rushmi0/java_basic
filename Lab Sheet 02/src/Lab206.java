import java.util.Scanner;

public class Lab206 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many product in basket : ");
		int unit = sc.nextInt();
		System.out.println();
		System.out.println("You have " + unit + " unit in basket.");
		int free = unit / 3;
		int paid = unit - free;
		System.out.println("Paid " + paid + " unit.");
		System.out.println("Free " + free + " unit.");
	}

}

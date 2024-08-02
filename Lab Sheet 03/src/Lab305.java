import java.util.Scanner;

public class Lab305 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input number : ");
		int num1 = sc.nextInt();
		System.out.print("Input number : ");
		int num2 = sc.nextInt();
		while (num1 < num2) {
			num1 = num2;
			System.out.print("Input number : ");
			num2 = sc.nextInt();
		}
		System.out.println();
		System.out.println("BYE BYE");

	}

}

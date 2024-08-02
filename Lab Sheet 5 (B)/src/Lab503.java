import java.util.Scanner;

public class Lab503 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number : ");
		int num = sc.nextInt();
		int sum = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				sum += i; // sum = sum + i;
			}
			System.out.println();
			System.out.print("Summation 1 to = " + sum);
		} else if (num < 0) {
			System.out.println();
			for (int i = 1; i <= 12; i++) {
				System.out.println(num + " x " + i + " = " + (num * i));
			}
		} else {
			System.out.println();
			System.out.print("End Process");
		}

	}

}

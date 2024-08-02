import java.util.Scanner;

public class Lab603 {

	public static void main(String[] args) {

		int[] num = { 78, 36, 58, 41, 25, 92, 75 };
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input index of array : ");
		int index = sc.nextInt();

		while (index >= num.length || index < 0) {
			System.out.print("Input index of array, again : ");
			index = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Value in current index is " + num[index]);
		if (index == num.length - 1) {
			System.out.println("Sorry, " + index + " is the last index in array.");
		} else {
			System.out.println("Value in next index is " + num[index + 1]);
		}

	}

}

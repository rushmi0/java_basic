import java.util.Scanner;

public class Lab502 {

	public static void main(String[] args) {

		Scanner ss = new Scanner(System.in);
		System.out.print("Input Hour : ");
		int hour = ss.nextInt();
		
		while (hour < 0) {
			System.out.print("Input Hour more than or equal 0 : ");
			hour = ss.nextInt();
		}
		
		System.out.println();
		System.out.print("Input Minute : ");
		int minute = ss.nextInt();
		
		while (minute <= 0 || minute >= 59) {
			System.out.print("Input Hour in range 0 - 59 : ");
			minute = ss.nextInt();
		}
		
		int minute1 = hour * 60;
		int calculate = minute1 + minute;
		System.out.println();
		System.out.println("Calculate all time in minute is " + calculate);

	}

}

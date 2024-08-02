import java.text.DecimalFormat;
import java.util.Scanner;

public final class Lab204 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat fr = new DecimalFormat("####.00");
		
		System.out.print("Input number 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("Input number 2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("Input number 3 : ");
		int num3 = sc.nextInt();
		
		System.out.println();
		
		int sum = num1+num2+num3;
		
		System.out.println("Sum of "+num1+ " , "+num2+" and "+num3+ " is "+fr.format(sum));
		System.out.println("Average is "+fr.format(sum/3f));

	}

}

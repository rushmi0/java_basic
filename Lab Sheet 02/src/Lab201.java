import java.text.DecimalFormat;

public class Lab201 {

	public static void main(String[] args) {
		
		int num1 = 87, num2 = 63, num3 = 78;
		System.out.println("Number 1 is "+num1);
		System.out.println("Number 2 is "+num2);
		System.out.println("Number 3 is "+num3);
		
		DecimalFormat fr = new DecimalFormat("####.00");
		
		int sum = num1+num2+num3;
		System.out.println();
		System.out.println("Sum of " + num1 + ", " + num2 + " and " + num3 + " is " +fr.format(sum));
		System.out.println("Average is " + fr.format(sum / 3));

	}

}

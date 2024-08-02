import java.util.Scanner;

public class Lab601 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int [] num = new int[7];
		for (int i = 0; i < num.length; i++)
		{
			System.out.print("Input number " + (i + 1) + " : ");
			num[i] = scan.nextInt();
		}
		int count = 0;
		System.out.println();
				
		System.out.print("List of odd number : ");
		for (int _num : num)
		{
			if (_num % 2 == 1)
			{
				System.out.print(_num + " ");
				count++;
			}
		}
		System.out.println("\nThere are " + count + " of odd number.");
	}

}

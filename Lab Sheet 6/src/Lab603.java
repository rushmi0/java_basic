import java.util.Scanner;

public class Lab603 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] m = { 78, 36, 58, 41, 25, 92, 75 };

		System.out.print("Input index of array : ");
		int num = sc.nextInt();
		
		  while (num > m.length-1 || num <  m.length-1) {
		  System.out.print("Input index of array, again : "); num = sc.nextInt();
		  
		  }
			  
		  System.out.println();
			System.out.println("Value current index is "+m[num]);
			if(num  < 7  ) {
				System.out.println("Next index"+m[num+1]);
			}

		}
	}


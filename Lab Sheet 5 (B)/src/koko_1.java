import java.util.Scanner;
public class koko_1 {

	public static void main(String[] args) {		
		Scanner sn = new Scanner(System.in);
		int count = 1, sum = 0 ,number;		
		System.out.print("Input number "+ count +" : " );
		  number =sn.nextInt();
		
		while(true) {		
			
			if(number<0) {
				System.out.print("Input number, again "+count+" : ");
				number = sn.nextInt();			 
			}		
			else if(number>0) {
				System.out.print("Input number "+ count++ +" : " );
				number =sn.nextInt();
				sum +=number;
				//count++;
			}
			else { 
				break;
			}		
	  }
		System.out.print("number " + sum);
	}
}

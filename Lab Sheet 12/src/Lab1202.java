import java.io.*;
import java.util.Scanner;

public class Lab1202 {

	public static void main(String[] args) throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("MemberLogin.txt"));
		Scanner sc = new Scanner(System.in);
		String temp = "";
		System.out.print("Input Email : ");
		String email =sc.next(); 
		boolean check = true; 
		while ((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			
			if(email.equalsIgnoreCase(data[3])) {
				check = false;
				System.out.print("Your password is "+data[2]);
			}			
		}
		if(check == true) {
			System.out.print("The data not found...");
		}
		read.close();
	}
}

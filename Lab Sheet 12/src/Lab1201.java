import java.io.*;
import java.util.Scanner;

public class Lab1201 {

	public static void main(String[] args) throws IOException{
		Scanner read = new Scanner(new File("MemberLogin.txt"));

		while (read.hasNext()) {
			String fname = read.next();
			String lname = read.next();
			read.next();
			String email = read.next();
			System.out.print(fname+" "+ lname+" ("+email+")\n");
		}
		read.close();
	}
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class sdga {

	public static void main(String[] args) throws IOException{
		

		while(true){
			BufferedReader read = new BufferedReader(new FileReader("StudentList108.txt"));
			Scanner scan = new Scanner(System.in);
			String temp = "",id = "",check = null;
			System.out.print("Input student Id : ");
			id = scan.next();
			System.out.println("-------------------------------");
			if(id.equals("0"))
				break;
			while((temp = read.readLine()) != null){
				String[] data = temp.split("\t");
				if(data[0].equals(id)){
					System.out.println("Id = " + data[0]);
					System.out.println("Name = " + data[2]);
					System.out.println("Section = " + data[3]);
					check = " "; 
					if(data[1].equals("Mr."))
						System.out.println("Gender = Male\n");
					else 
						System.out.println("Gender = Female\n");
				}
			}
			if(check == null) 
				System.out.println("Incorrect student id ...\n");
			check =null;
			read.close();
		}
		System.out.println("END PROCESS,BYE BYE ...");

	}

}

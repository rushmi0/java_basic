//2013111089 Watcharapol phongwilai
import java.io.*;
import java.util.Scanner;

public class Lab1211 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);	
	    while(true) {
	    	BufferedReader read = new BufferedReader(new FileReader("StudentList108.txt"));
	    	System.out.print("Input student id : ");
		    String id = sc.next();
	    	if(id.equals("0")) {
	    		System.out.print("--------------------------------"+"\n"+"END PROCESS, BYE BYE ...");
	    		break;
	    	}	 	    	
		boolean check = true;
		String temp = "";
		while ((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");				
			if(id.equalsIgnoreCase(data[0])) {				
				check = false;
			if(data[1].equalsIgnoreCase("Miss")){	
				System.out.print("--------------------------------"+"\n"
				+"Id = "+data[0]+"\n"
				+"Name = "+data[2]+"\n"
				+"Section = "+data[3]+"\n"
				+"Gender = "+data[1].replace(data[1], "Female")+"\n");	
				System.out.println();
			}
			if(data[1].equalsIgnoreCase("Mr.")){	
				System.out.print("--------------------------------"+"\n"
				+"Id = "+data[0]+"\n"
				+"Name = "+data[2]+"\n"
				+"Section = "+data[3]+"\n"
				+"Gender = "+data[1].replace(data[1], "Male")+"\n");	
				System.out.println();
			}
		  }					  		  
		}
		if(check == true) {
			System.out.print("--------------------------------"
		      +"\n"+"Incorrect student id..."+"\n");
			System.out.println();
		}
		read.close();
	  }
	}
}

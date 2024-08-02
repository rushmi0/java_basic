import java.io.*;
import java.util.Scanner;

public class Lab1206 {

	public static void main(String[] args) throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("BookData.txt"));
		Scanner sc = new Scanner(System.in);
		String temp = "";
		
		System.out.print("tina fey : ");
		String tina =sc.nextLine(); 
		
		boolean check = true; 
		while ((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			
			if(tina.equalsIgnoreCase(data[0])) {
				check = false;
				System.out.print("Book Title  :"+ data[0]+"\n"
						+"Author name  :"+data[1]+"\n"
						+"Rating score  :"+data[2]+"\n"
						+"Nums Reviews  :"+data[3]+"\n"
						+"Published  :"+data[4]+"\n"
						+"Book Genre  :"+data[6]);
			}			
		}
		if(check == true) {
			System.out.print("The data not found...");
		}
		read.close();
	}

}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lab1301 {

	public static void main(String[] args) throws IOException {

		System.out.println("---------------------------------");
		System.out.println("List of Student section 1");
		System.out.println("---------------------------------");	
		showListStudent(1);
		
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("List of Student section 2");
		System.out.println("---------------------------------");	
		showListStudent(2);

	}
	
	public static void showListStudent(int section) throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("List107.txt"));
		String temp = "";
		while ((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			int sec = Integer.parseInt(data[3]);
			
			float j = Float.parseFloat(data[4]);
			float o = Float.parseFloat(data[5]);
			if(sec == section) {				
				System.out.println(data[0]+" "+data[1]+" "+data[2]+" ("+(j+o)+") ");
			}						
		}
		read.close();
	}
}

import java.io.*;
public class Lab1204 {

	public static void main(String[] args) throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("BookData.txt"));
		String temp = "";
		while ((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");			
			System.out.print(data[0]+" ("+data[1]+"), "+"Rating "+data[2]+" publish on "+data[5]+"\n");			
		}
		read.close();
	}
}

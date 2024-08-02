//2013111089 watchrapol phongwilai
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchBook extends Book {

	public SearchBook(String title) {
		super(title);
	}

	private String readBookInFile() throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("Book.txt"));
		String temp = "";
		boolean check = true;
		while ((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			if (data[0].equalsIgnoreCase(getTitle())) {
				check = false;
				break;
			}
			if (data[0].equals(getTitle())) {
				return "write by " + data[1];
			}
		}
		if (check == true) {
			return "No data found";
		}
		read.close();
		return null;

	}

	public String toString(){
		try {
			return readBookInFile();
		}
		catch (IOException e) {
			return e.getMessage();
		}

	}

}

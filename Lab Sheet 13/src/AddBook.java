//2013111089 watchrapol phongwilai
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AddBook extends Book {

	public AddBook(String title, Author author, int page) {
		super(title, author, page);

	}

	private void addBookInFile() throws Exception {
		PrintWriter write = new PrintWriter(new FileWriter("Book.txt", true));
		write.println(super.getTitle() + "\t" + super.getAuthor() + "\t" + getAuthor().getEmail() + "\t" + super.getPage());
				
		write.close();
	}

	public String toString() {
		try {
			addBookInFile();
		} catch (Exception e) {
			return super.getTitle() + "cannot add in file...";
		}
		return super.getTitle() +" "+ getAuthor().toString() + "add in file already!";
	}
}

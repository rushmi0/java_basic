//2013111089 watchrapol phongwilai
import java.util.Scanner;

public class BookStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[1] Add book in file");
		System.out.println("[2] searcShBook book from file");
		System.out.print("Input option : ");
		int scan = sc.nextInt();
		System.out.println();
		
		while (scan != 1 && scan != 2) {
			System.out.print("Input option : ");
			 scan = sc.nextInt();
		}
		if(scan == 1) {
			addBook();
		}
		if(scan == 2) {
			searchBook();
		}
		
	}
	
	public static void addBook() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input book title : ");
		String title = sc.nextLine().toLowerCase();
		System.out.print("Input auther name : ");
		String name = sc.nextLine().toLowerCase();
		System.out.print("Input auther e-mail : ");
		String mail = sc.nextLine().toLowerCase();
		System.out.print("Input book page : ");
		int page = sc.nextInt();
		
		Author author = new Author(name, mail);
		AddBook addBook = new AddBook(title, author, page);
		System.out.print(addBook.toString());
	}
	
	public static void searchBook() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input book to search : ");
		String title = sc.nextLine().toLowerCase();
		
		SearchBook searchBook = new SearchBook(title);
		System.out.print(searchBook.toString());
		
	}

}

//2013111089 watchrapol phongwilai
public class Book {

	private String title;
	private Author author;
	private int page;
	
	public Book(String title, Author author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	public Book(String title) {
		this.title = title;
		this.author = null;
		this.page = 0;
	}
	
	public Book() {
		this.title = null;
		this.author = null;
		this.page = 0;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public Author getAuthor() {
		return this.author;
	}
	
	public int getPage(){
		return this.page;
	}
}

//2013111089 watchrapol phongwilai
public class Author {

	private String name;
	private String email;
	
	public Author(String name, String email){
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String toString() {
		return this.name+" ("+ this.email + ") ";
	}

}

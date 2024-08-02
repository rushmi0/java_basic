//2013111089 ÇÑªÃ¾Å ¾§ÉìÇÔÅÑÂ
public class Director {
	private String name;
	private String email;
	private char gender;
	
	public Director(String name, String email, char gender) {
		 this.name   = name;
		 this.email  = email;
		 this.gender = gender;
	}
	public Director(String name, String email) {
		this(name,email,' ');
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName() {
		if(Character.toUpperCase(this.gender) == 'm')
			return  "Male";
		if(Character.toUpperCase(this.gender) == 'f')
			return  "Female";
		 return null;
	}
	public String tostrString() {
		return this.name +" ("+this.email+";"+getGenderName()+")";
	}
	
}

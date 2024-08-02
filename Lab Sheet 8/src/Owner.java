import java.time.Year;

public class Owner {

	private String name;
	private String email;
	private int birthyear;
	
	public  Owner(String name,String email,int birthyear) {
		this.name = name;
		this.email = email;
		this.birthyear = birthyear;
	}
	public  Owner(String name,int birthyear) {
		this(name,null,birthyear);
	}
	public Owner(String name,String email) {
		this(name,email,0);
	}
	public Owner() {
		this(null,null,0);
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public int getAge() {
		return  Year.now().getValue() - this.birthyear;
	}
	public String toString() {
	if(this.email.endsWith("@hotmail.com"))
		return getName()+"("+getEmail()+";"+getAge()+" year old";
	if(this.email.endsWith("@gmail.com"))
		return getName()+"("+getEmail()+";"+getAge()+" year old";
	return getName()+"("+getAge()+"year old";
	
	}

}

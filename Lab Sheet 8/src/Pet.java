import java.time.Year;

public class Pet {

	private String name;
	private char gender;
	private int birthyear;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getGender() {
		return this.gender;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	public int getBirthyear() {
		return this.birthyear;
	}

	public String getGenderName() {
		if (Character.toUpperCase(this.gender) == 'M')
			return "Male";
		if (Character.toUpperCase(this.gender) == 'F')
			return "Female";
		return null;
	}

	public int getAge() {
		return Year.now().getValue() - this.birthyear;
	}

	public String toString() {

		return "Pet name: " + name + "(" + getAge() + " year old; " + getGenderName() + ")";
	}

}

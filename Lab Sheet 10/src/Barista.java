//2013111089 �Ѫþ� ���������
public class Barista {
	private String name;
	private char gender;

	public Barista(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}

	public Barista() {
		this(null, ' ');
	}

	public String getName() {
		return this.name;
	}

	public String getGenderName() {
		switch (gender) {
		case 'M':
			return "Male";
		case 'F':
			return "Female";
		}
		return "spacebar";
	}

}

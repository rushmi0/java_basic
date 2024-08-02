
public class Coffee extends Drink {

	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;

	public Coffee(int type, char sizeCoffee, int typeCoffee, Barista barista) {
		super(type, sizeCoffee);
		this.typeCoffee = typeCoffee;
		this.sizeCoffee = sizeCoffee;
		this.barista = barista;
	}

	public Coffee() {
		this(0, ' ', 0, null);
	}

	public Barista getBarista() {
		return this.barista;
	}

	public String getTypeName() {
		switch (typeCoffee) {
		case 1:
			return "Americano";
		case 2:
			return "Espresso";
		case 3:
			return "Cappuccino";
		}
		return null;
	}

	public int getTypePrice() {
		switch (typeCoffee) {
		case 1:
			return 50;
		case 2:
			return 55;
		case 3:
			return 65;
		}
		return 0;
	}

	public String getSizeName() {
		switch (sizeCoffee) {
		case 'S':
		case 's':
			return "Short";
		case 'T':
		case 't':
			return "Tall";
		case 'G':
		case 'g':
			return "Grande";
		case 'V':
		case 'v':
			return "Venti";
		}
		return null;
	}

	public int getSizePrice() {
		switch (sizeCoffee) {
		case 'S':
		case 's':
			return 100;
		case 'T':
		case 't':
			return 150;
		case 'G':
		case 'g':
			return 200;
		case 'V':
		case 'v':
			return 250;
		}
		return 0;
	}

	public int getTotalPrice() {
		return super.getTypePrice() + this.getTypePrice() + this.getSizePrice();
	}

	public String toString() {
		return super.getTypeName() + " " + this.getTypeName() + " (" + this.getSizeName() + ") is "
				+ this.getTotalPrice() + " baht";
	}

}

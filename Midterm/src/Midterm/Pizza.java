//2013111089 ÇÑªÃ¾Å ¾§ÉìÇÔÅÑÂ
public class Pizza {
	private String toppings;
	private int inches;
	private double price;
	private int toppings2;
	public void setToppings(int typepizza) {
		toppings2 = typepizza;
	}
	public String getTypetoppingsName() {
		switch(toppings2) {
		case 1:
		return "Carbonara";
		case 2:
		return "Margarita";
		}
		return null;
	}
		public int getTypePrice() {
		switch (inches) {
		case 1:
			return 50;
		case 2:
			return 55;		
		}
		return 0;
	}
	public void setInches(int Inches) {
		inches = Inches;
	}
	public String getsize() {
		switch (inches) {
		case 1:
			return " size 8 ";
		case 2:
			return " size 12 ";
		}
		return null;
	}
	public int getSizePrice() {
		switch (inches) {
		case 1:
			return 100;
		case 2:
			return 150;
		default:
			return 0;
		}
	}
}

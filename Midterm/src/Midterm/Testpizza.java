//2013111089 ÇÑªÃ¾Å ¾§ÉìÇÔÅÑÂ
import java.util.Scanner;
public class Testpizza {
	public static void main(String[] args) {
		Pizza pz = new Pizza();
		Scanner sc = new Scanner(System.in);
		System.out.print("pizza number (1) Carbonara , number (2) Margarita :");
		pz.setToppings(sc.nextInt());
		System.out.print("Inches number (1) size 8 , number (2) size 12 :");
		pz.setInches(sc.nextInt());
		System.out.print("Pizza is " + pz.getTypetoppingsName() + pz.getsize() + " price is " + pz.getTypePrice());
	}
}

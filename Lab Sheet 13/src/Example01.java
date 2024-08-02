import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input product id : ");
		String id = sc.next();
		System.out.print("Input product name : ");
		String name = sc.next();

		System.out.print("Input product unit : ");
		int unit = sc.nextInt();
		System.out.print("Input product price: ");
		float price = sc.nextFloat();

		try {
			// PrintStream write = new PrintStream(new File("Sale.txt"));��¹�Ѻ���������
			PrintWriter write = new PrintWriter(new FileWriter("Sale.txt", true));// ��¹��� �����������������
			write.println(id + "\t" + name + "\t" + unit + "\t" + price);
			write.close();

			System.out.println("\nSave data already...");
		} catch (Exception e) {
			System.out.println("\nSave data already...");
		}

	}

}

import java.util.Scanner;
import java.text.DecimalFormat;
public class ProductListDemo1 {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		ProductList product = new ProductList();
		
		System.out.print("Input product ID : ");
		product.setId(sc.next());
		
		System.out.print("Input product Price : ");
		product.setPrice(sc.nextFloat());
		
		System.out.print("Input product Unit : ");
		product.setUnit(sc.nextInt());
		
		System.out.println();
		System.out.println("Total price is "+df.format(product.getTotalprice())+"baht.");

	}

}

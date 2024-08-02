
public class Invoice {

	private int total;
	private String cashierName, recipentName;
	private Product[] products;

	public Invoice(Product products, String cashierName, String recipentName) {

	}

	public Product getProduct(int index) {
		// get product at index
		return products[index];
	}

	public Product[] getProduct() {
		return this.products;
	}

	public String getCashier() {
		return cashierName;
	}

	public String getRecipent() {
		return this.cashierName;
	}

	public double getTotal() {
		double localCount = 0;
		for (Product prod : products) {
			localCount += prod.getTotal();
		}

		return localCount;
	}

}

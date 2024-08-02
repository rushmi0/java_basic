
public class Product {

	private double price;
	private String id;
	private String name;
	private int count;

	public Product(double price, String id, String name, int count) {
		this.price = price;
		this.id = id;
		this.count = count;
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public String name() {
		return this.name;
	}

	public int count() {
		return this.count;
	}

	public double price() {
		return this.price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getTotal() {
		return price * count;
	}

}

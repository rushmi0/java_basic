
public class ProductList {

	private String ID;
	private float price;
	private int unit;
	
	
	public void setId(String Id) {
		ID = Id;
	}
	public String getId() {
		return ID;
	}
	public void setPrice(Float Price) {
		price = Price;
	}
	public float getPrice() {
		return price;
	}
	public void setUnit(int Unit) {
		unit = Unit;
	}
	public int getUnit() {
		return unit;
	}
	public float getTotalprice() {
		return price * unit;
	}
	
}

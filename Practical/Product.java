
public class Product {

	double price = 0;
	int quantity = 0;
	String name;
	
	public Product() {

	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		if (price==0) {
		return "The biggest quantity: " + name + " Quantity " + quantity;
		}else
		return "Most expensive item: " + name + " Price: " + price;
		//Product2 per2 = new Product2();
		//per2.bestPrice();
		//if (per2.bestQuantity());
		
		//return ex + "\n" + ex1;
	}
}
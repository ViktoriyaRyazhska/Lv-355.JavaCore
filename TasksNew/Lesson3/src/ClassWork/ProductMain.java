package ClassWork;

public class ProductMain {
	public static void main(String[] args) {
		Product p1 = new Product("Coffee", 30, 500);
		Product p2 = new Product("Water", 15, 1500);
		Product p3 = new Product("Juice", 10, 250);
		Product p4 = new Product("Milk", 25, 500);
		if (p1.getPrice() > p2.getPrice() && p1.getPrice() > p3.getPrice() && p1.getPrice() > p4.getPrice()) {
			System.out.println("The most expensie product is " + p1.getName());
		}
		if (p2.getPrice() > p1.getPrice() && p2.getPrice() > p3.getPrice() && p2.getPrice() > p4.getPrice()) {
			System.out.println("The most expensive product is " + p2.getName());

		}
		if (p3.getPrice() > p1.getPrice() && p3.getPrice() > p2.getPrice() && p3.getPrice() > p4.getPrice()) {
			System.out.println("The most expensive product is " + p3.getName());

		}
		if (p4.getPrice() > p1.getPrice() && p4.getPrice() > p2.getPrice() && p4.getPrice() > p3.getPrice()) {
			System.out.println("The most expensive product is " + p4.getName());
		}
		if (p1.getQuantity() > p2.getQuantity() && p1.getQuantity() > p3.getQuantity()
				&& p1.getQuantity() > p4.getQuantity()) {
			System.out.println("The largest product is " + p1.getName());
		}
		if (p2.getQuantity() > p1.getQuantity() && p2.getQuantity() > p3.getQuantity()
				&& p2.getQuantity() > p4.getQuantity()) {
			System.out.println("The largest product is " + p2.getName());

		}
		if (p3.getQuantity() > p1.getQuantity() && p3.getQuantity() > p2.getQuantity()
				&& p3.getQuantity() > p4.getQuantity()) {
			System.out.println("The largest product is " + p3.getName());

		}
		if (p4.getQuantity() > p1.getQuantity() && p4.getQuantity() > p2.getQuantity()
				&& p4.getQuantity() > p3.getQuantity()) {
			System.out.println("The largest product is " + p4.getName());
		}

	}
}

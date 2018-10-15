
public class Product2 {

	Product p1 = new Product("Каша", 11.1, 10);
	Product p2 = new Product("Машина", 110, 7);
	Product p3 = new Product("Телефон", 65, 9);
	Product p4 = new Product("Каток", 922, 2);

	public void bestPrice() {
		if (p1.getPrice() > p2.getPrice() && p1.getPrice() > p3.getPrice() && p1.getPrice() > p4.getPrice()) {
			System.out.println(p1);
		} else if (p2.getPrice() > p1.getPrice() && p2.getPrice() > p3.getPrice() && p2.getPrice() > p4.getPrice()) {
			System.out.println(p2);
		} else if (p3.getPrice() > p1.getPrice() && p3.getPrice() > p2.getPrice() && p3.getPrice() > p4.getPrice()) {
			System.out.println(p3);
		} else if (p4.getPrice() > p1.getPrice() && p4.getPrice() > p2.getPrice() && p4.getPrice() > p3.getPrice()) {
			System.out.println(p4);
		}
	
	}

	public void bestQuantity() {
		if (p1.getQuantity() > p2.getQuantity() && p1.getQuantity() > p3.getQuantity()
				&& p1.getQuantity() > p4.getQuantity()) {
			System.out.println(p1);
		} else if (p2.getQuantity() > p1.getQuantity() && p2.getQuantity() > p3.getQuantity()
				&& p2.getQuantity() > p4.getQuantity()) {
			System.out.println(p2);
		} else if (p3.getQuantity() > p1.getQuantity() && p3.getQuantity() > p2.getQuantity()
				&& p3.getQuantity() > p4.getQuantity()) {
			System.out.println(p3);
		} else if (p4.getQuantity() > p1.getQuantity() && p4.getQuantity() > p2.getQuantity()
				&& p4.getQuantity() > p3.getQuantity()) {
			System.out.println(p4);
		}
	
	}

	public static void main(String[] args) {
		Product2 p0 = new Product2();
		

		p0.bestQuantity();
		p0.bestPrice();
		//System.out.println(p0.bestPrice(""));
//		Product2 p11 = new Product2();	
//			System.out.println(p0.bestQuantity());
	}
}

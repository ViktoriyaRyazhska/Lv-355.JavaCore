
public class Main {
	public static void main(String[] args) {
		Product butter = new Product();
		butter.setName("Horoshe");
		butter.setPrice(90);
		butter.setQuantity(1000);
		Product water = new Product();
		water.setName("Morshynska");
		water.setPrice(100);
		water.setQuantity(240);
		Product snack = new Product();
		snack.setName("Kitkat");
		snack.setPrice(140);
		snack.setQuantity(1760);
		Product milk = new Product();
		milk.setName("TheBest");
		milk.setPrice(1600);
		milk.setQuantity(372);
		if ((butter.getPrice() > water.getPrice()) && (butter.getPrice() > snack.getPrice())
				&& (butter.getPrice() > milk.getPrice())) {
			System.out.println(butter.getName() + " " + butter.getQuantity());
		} else if ((water.getPrice() > butter.getPrice()) && (water.getPrice() > snack.getPrice())
				&& (water.getPrice() > milk.getPrice())) {
			System.out.println(water.getName() + " " + water.getQuantity());
		} else if ((snack.getPrice() > butter.getPrice()) && (snack.getPrice() > water.getPrice())
				&& (snack.getPrice() > milk.getPrice())) {
			System.out.println(snack.getName() + " " + snack.getQuantity());
		} else if ((milk.getPrice() > butter.getPrice()) && (milk.getPrice() > snack.getPrice())
				&& (milk.getPrice() > water.getPrice())) {
			System.out.println(milk.getName() + " " + milk.getQuantity());
		}
		
		
		if ((butter.getQuantity() > water.getQuantity()) && (butter.getQuantity() > snack.getQuantity())
				&& (butter.getQuantity() > milk.getQuantity())) {
			System.out.println(butter.getName());}
			else if ((water.getQuantity() > butter.getQuantity()) && (water.getQuantity() > snack.getQuantity())
					&& (water.getQuantity() > milk.getQuantity())) {
				System.out.println(water.getName());}
			else if ((snack.getQuantity() > water.getQuantity()) && (snack.getQuantity() > butter.getQuantity())
					&& (snack.getQuantity() > milk.getQuantity())) {
				System.out.println(snack.getName());}
			else if ((milk.getQuantity() > water.getQuantity()) && (milk.getQuantity() > snack.getQuantity())
					&& (milk.getQuantity() > butter.getQuantity())) {
				System.out.println(milk.getName());

			}
		}
	}

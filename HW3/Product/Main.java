package Product;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
Product coffee = new Product("Jacobs", 40, 250);
Product milk = new Product("Molochar", 20, 500);
Product water = new Product("Sprite", 21, 2000);
Product juice = new Product("Jaffa", 30, 500);
if (coffee.price > milk.price && coffee.price > water.price && coffee.price > juice.price ) {
	System.out.println("Найдорожчий товар:");
	System.out.println(coffee.name);
}
if (milk.price > coffee.price && milk.price > water.price && milk.price > juice.price) {
	System.out.println("Найдорожчий товар:");
	System.out.println(milk.name);
}
if (water.price > coffee.price && water.price > milk.price && water.price > juice.price) {
	System.out.println("Найдорожчий товар:");
	System.out.println(water.name);
}
if (juice.price > coffee.price && juice.price > milk.price && juice.price > water.price) {
	System.out.println("Найдорожчий товар:");
	System.out.println(juice.name);	
}

if (coffee.quantity > milk.quantity && coffee.quantity > water.quantity && coffee.quantity > juice.quantity) {
	System.out.println("Найбфльший товар");
	System.out.println(coffee.name);	
}
if (milk.quantity > coffee.quantity && milk.quantity > water.quantity && milk.quantity > juice.quantity) {
	System.out.println("Найбфльший товар");
	System.out.println(milk.name);
}
if (water.quantity > coffee.quantity && water.quantity > milk.quantity && water.quantity > juice.quantity) {
	System.out.println("Найбфльший товар");
	System.out.println(water.name);
}
	if (juice.quantity > coffee.quantity && juice.quantity > milk.quantity && juice.quantity > water.quantity) {
		System.out.println("Найбфльший товар");
		System.out.println(juice.name);	
	}
	
	}
	



}



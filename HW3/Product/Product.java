package Product;

 class Product {
public String name;
int price;
int quantity;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Product(){
	
}
public Product (String name, int price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}
public Product (String name, int price) {
	this.name = name;
	this.price = price;
	
}
@Override
public String toString() {
	return "����� ������: " + name 
+ " ����: " +  price + 
" �������:" + quantity;
}

}

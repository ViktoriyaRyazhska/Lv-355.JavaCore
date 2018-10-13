package com.swich.test;

public class Main4 {

    public static void main(String[] args) {

        Product[] products = new Product[4];
        products[0] = new Product("Product 1", 53, 16);
        products[1] = new Product("Product 2", 42, 24);
        products[2] = new Product("Product 3", 81, 27);
        products[3] = new Product("Product 4", 71, 37);

        System.out.println("Expensive is: " + getExpensive(products).getName());
        System.out.println("Biggest quantity is: " + getBiggest(products).getName());

    }

    public static Product getExpensive(Product[] products) {
        int max = -1;
        Product expensive = products[0];
        for (Product p : products) {
            if (p.getPrice() > max) {
                max = p.getPrice();
                expensive = p;
            }
        }
        return expensive;
    }

    public static Product getBiggest(Product[] products) {
        int max = -1;
        Product biggest = products[0];
        for (Product p : products) {
            if (p.getQuantity() > max) {
                max = p.getQuantity();
                biggest = p;
            }
        }
        return biggest;
    }

}

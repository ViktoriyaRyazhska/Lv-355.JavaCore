package HomeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {

	String type;
	int year_prod;
	double engine;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear_prod() {
		return year_prod;
	}

	public void setYear_prod(int year_prod) {
		this.year_prod = year_prod;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public Car(String type, int year_prod, double engine) {
		this.type = type;
		this.year_prod = year_prod;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", year_prod=" + year_prod + ", engine=" + engine + "]";
	}

	public static void main(String[] args) {
		Car[] car1 = new Car[4];
		car1[0] = new Car("BMW 5X", 2016, 3.1);
		car1[1] = new Car("Audi A6", 2017, 2.8);
		car1[2] = new Car("Ferrari", 2010, 6.5);
		car1[3] = new Car("Nissan", 2011, 2.6);
		years(car1);
		compare(car1);
		for (int i = 0; i<car1.length; i++) {
			System.out.println(car1[i]);
		}
	}

	public static void years(Car[] p) {

		for (int i = 0; i < p.length; i++) {

			if (p[i].getYear_prod() == 2011) {
				System.out.println(p[i]);
			}
		}

	}

	public static void compare(Car[] p) {
		Car ca;

		for (int i = 0; i < p.length - 1; i++) {

			for (int j = i + 1; j < p.length; j++) {

				if (p[i].getYear_prod() < p[j].getYear_prod()) {

					ca = p[i];

					p[i] = p[j];

					p[j] = ca;
				}
			}

		}
	}
}
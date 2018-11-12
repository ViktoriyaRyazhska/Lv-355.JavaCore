import java.util.Scanner;
public class Car {
	
	private String type;
	private int year_of_production;
	private double engine_capacity;
	
	public Car(String type, int year_of_production, double engine_capacity) {
		this.type = type;
		this.year_of_production = year_of_production;
		this.engine_capacity = engine_capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear_of_production() {
		return year_of_production;
	}
	public void setYear_of_production(int year_of_production) {
		this.year_of_production = year_of_production;
	}
	public double getEngine_capacity() {
		return engine_capacity;
	}
	public void setEngine_capacity(double engine_capacity) {
		this.engine_capacity = engine_capacity;
	}
	public Car() {}
	
	public static void certainYear(Car[] cars, int year) {
		
		boolean y = true;
		
		System.out.print("Certain year: ");
		for (int i = 0; i < cars.length; i++) {
			if(cars[i].getYear_of_production() == year) {
				System.out.print(cars[i].getType() + " ");
				y = false;
			}
		}
		if(y == true) {
			System.out.println("nothing");
		}
	}
	
	@Override
	public String toString() {
		return "Car [type=" + type + ", year_of_production=" + year_of_production + ", engine_capacity="
				+ engine_capacity + "]";
	}

	public static void orderedByTheYear(Car[] cars) {
		System.out.println();
		Car tmp;
		for (int i = 0; i < cars.length - 1; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if(cars[i].getYear_of_production() < cars[j].year_of_production) {
					tmp = cars[i];
					cars[i] = cars[j];
					cars[j] = tmp;
				}
			}
		}
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}
	
	public void input(Scanner sc) {
		System.out.print("Enter type: ");
		this.type = sc.next();
		System.out.print("Enter year: ");
		this.year_of_production = sc.nextInt();
		System.out.println("Enter capacity: ");
		this.engine_capacity = sc.nextDouble();
	}
	
	
}

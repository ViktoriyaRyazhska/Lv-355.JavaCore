import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
	private String type;
	private int yearOfPr;
	private int engineCapacity;

	public Car() {

	}

	public Car(String type, int yearOfPr, int engineCapacity) {
		this.type = type;
		this.yearOfPr = yearOfPr;
		this.engineCapacity = engineCapacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearOfPr() {
		return yearOfPr;
	}

	public void setYearOfPr(int yearOfPr) {
		this.yearOfPr = yearOfPr;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public String NOF(Car[] car) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the year");
		int a = Integer.parseInt(reader.readLine());
		for (int i = 0; i < car.length; i++) {
			if (a == car[i].getYearOfPr()) {
				System.out.println(car[i]);
			}

		}
		return " ";
	}

	public String toString() {
		return type + " " + yearOfPr + " " + engineCapacity;
	}

	public static void main(String[] args) throws IOException {
		Car c = new Car();
		Car[] car = { new Car("Ford", 2016, 300), new Car("BMW", 2013, 500), new Car("Nissan", 2018, 550),
				new Car("Lamborgini", 2011, 400) };
		System.out.println(c.NOF(car));
		Car r;
		for (int i = 0; i < car.length - 1; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].getYearOfPr() < car[j].getYearOfPr()) {
					r = car[i];
					car[i] = car[j];
					car[j] = r;
				}
			}
		}
		System.out.println("Sorted cars by year:");
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
	}

}

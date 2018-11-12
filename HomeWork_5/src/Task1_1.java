import java.util.Scanner;

public class Task1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Car c1 = new Car();
		c1.input(sc);
		Car c2 = new Car();
		c2.input(sc);
		Car c3 = new Car();
		c3.input(sc);
		Car c4 = new Car();
		c4.input(sc);
		
		/*Car[] car = {new Car("car1", 2000, 50),
				new Car("car2", 2010, 100),
				new Car("car3", 2015, 70),
				new Car("car4", 2000, 50)
		}; */
		Car[] car = {c1, c2, c3, c4};
		System.out.print("Enter the year of production: ");
		int year = sc.nextInt();
		sc.close();
		Car.certainYear(car, year);
		Car.orderedByTheYear(car);
	}

}

package TopolHomework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework4_Topole {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int myExit = 1;
		do {
			System.out.println("Enter the number of task (1-5). 0 - in case of exit:");
			int choise = Integer.parseInt(br.readLine());
			myExit = choise;
			for (int i = 0; i < 30; ++i) {
				System.out.println();
			}

			switch (choise) {
			case 1:
//          1.Ask user to enter the number of month.
//			Read the value and write the amount of days
//          in this month (create array with amount days of each month).

				System.out.println("Enter the number of month");
				int nMonth = Integer.parseInt(br.readLine());
				// br.close();
				myTasksClass.myMonth(nMonth);
				break;
			case 2:
				/*
				 * 2.Enter 10 integer numbers. Calculate the sum of first 5 elements if they are
				 * positive or product of last 5 element in the other case.
				 */
				myTasksClass.myCalc();
				// як зробити так, щоб використовувати лише один BufferedReader???
				// як його передати в статичний метод myCalc(), щоб не довелос€ там створювати
				// новий br ???
				break;
			case 3:
//			3.Enter 5 integer numbers. Find 
//			-position of second positive number;
//			-minimum and its position in the array.
				myTasksClass.numberFind();
				break;
			case 4:
				/*
				 * 4.Organize entering integers until the first negative number. Count the
				 * product of all entered even numbers.
				 */

				myTasksClass.onlyPositive();
				break;
			case 5:
//			5.Create class Car with fields type, year of production and engine capacity.
//			Create and initialize four instances of class Car. Display cars
//			certain model year  (enter year in the console);
//			ordered by the field year.

				// carShop.create();
				// як створити ≥нстанси в метод≥ ≥ передати њх в main ???
				// як б≥льш правильно - створювати ≥нстанси в мейн≥ чи
				// в окремому клас≥ ≥ пот≥м передавати в мейн ???

				final int nCar = 4;
				Car[] myCar = new Car[nCar];
				// BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
				// як в≥дкрити закритий об'Їкт класу BufferedReader

				/*
				 * for (int i = 0; i < myCar.length; i++) { System.out.println((i+1)+ " car:");
				 * System.out.println("Enter type of car"); String carType = br.readLine();
				 * System.out.println("Enter year of car"); int carYear =
				 * Integer.parseInt(br.readLine());
				 * System.out.println("Enter engine volume of car"); double carEngineVol =
				 * Double.parseDouble(br.readLine()); myCar[i] = new Car(carType, carYear,
				 * carEngineVol); System.out.println("----------------------------"); }
				 */

				myCar[0] = new Car("Mazda      ", 2015, 2.0);
				myCar[1] = new Car("BMW        ", 2018, 3.0);
				myCar[2] = new Car("Volkswagen ", 2015, 1.6);
				myCar[3] = new Car("Renault    ", 2018, 1.8);

				carShop.displayYear(myCar);
				carShop.orderYear(myCar);

				break;
			// default:
			// System.out.println("We have only five task");
			// break;
			}
		} while (myExit != 0);
	}
}

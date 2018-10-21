package TopolHomework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class carShop {

	public static void displayYear(Car[] myCar) throws NumberFormatException, IOException {

		System.out.println("Enter year of car");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int yearCar1 = Integer.parseInt(br.readLine());
		br.close();
		System.out.println("Car of " + yearCar1 + " year");
		for (int i = 0; i < myCar.length; i++) {
			if (myCar[i].getYearOfProduction() == yearCar1) {
				System.out.println(myCar[i].toString());
			}
		}
		System.out.println("----------------");

	}

	public static void orderYear(Car[] myCar) {

		Car tmp;
		System.out.println("We order cars by year:");
		for (int i = 0; i < myCar.length - 1; i++) {
			for (int j = i + 1; j < myCar.length; j++) {
				if (myCar[i].getYearOfProduction() < myCar[j].getYearOfProduction()) {
					tmp = myCar[i];
					myCar[i] = myCar[j];
					myCar[j] = tmp;
				}
			}
		}

		for (int i = 0; i < myCar.length; i++) {
			System.out.println(myCar[i].toString());
		}

	}

}

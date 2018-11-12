package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class MainClassForCarr {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Car tmp;
		Car w1 = new Car("Sedan", 2006, 1.8);
		Car bmw2 = new Car("Hetchback", 2012, 2.2);
		Car porsche = new Car("Sedan", 2018, 3.2);
		Car zaz = new Car("TANK", 1973, 1.6);
		Car[] cars = new Car[4];
		cars[0] = w1;
		cars[1] = bmw2;
		cars[2] = porsche;
		cars[3] = zaz;
		System.out.println("Enter the year of the model");
		int entered = Integer.parseInt(br.readLine());
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getYearOfProduction() == entered) {
				System.out.println("Theres is matching. Nice car for you is: " + cars[i]);
				 
					
				
			}
			System.out.println(cars[i].getYearOfProduction() + " Doesn't match your creteria");
		
			
		}
		for (int i = 0; i < cars.length - 1; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].getYearOfProduction() < cars[j].getYearOfProduction()) {
					 tmp = cars[j];
					cars[i] = cars[j];
					cars[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	
	}
	

}

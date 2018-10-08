package homeWorkNew1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homeWorkNew1Topol {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		/*
		 * Task 1: Flower bed is shaped like a circle. Calculate the perimeter and area
		 * by entering the radius. Output obtained results.
		 */
		double pi = 3.14;
		double bedPerimeter = 0;
		double bedArea = 0;
		double radius = 0;
		BufferedReader brTask1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Task1:");
		System.out.println("Enter the radius of the flower bed");
		radius = Double.parseDouble(brTask1.readLine());
		bedPerimeter = 2 * pi * radius;
		bedArea = pi * (radius * radius);
		System.out.println("Flower bed perimeter is: " + bedPerimeter);
		System.out.println("Flower bed area      is: " + bedArea);
		System.out.println();

		/*
		 * Task2: Define String variables name and address. Output question
		 * "What is your name?" Read the value name and output next question: “Where are
		 * you live, (name)?". Read address and write whole information.
		 */
		String name;
		String address;
		BufferedReader brTask2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Task2:");
		System.out.println("What is your name?");
		name = brTask2.readLine();
		System.out.println("Where are you live " + name + "?");
		address = brTask2.readLine();
		System.out.println("Ok, " + name + "! You live here: " + address);
		System.out.println();
		/*
		 * Task3: Phone calls from three different countries are ñ1, ñ2 and ñ3 standard
		 * units per minute. Talks continued t1, t2 and t3 minutes. How much computer
		 * will count for each call separately and all talk together? Input all source
		 * data from console, make calculations and output to the screen.
		 */
		int country1;
		int country2;
		int country3;
		int time1;
		int time2;
		int time3;
		int value1;
		int value2;
		int value3;
		int sum;

		BufferedReader brTask3 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Task3:");
		System.out.println("Enter the call price of the first country (units per minute):");
		country1 = Integer.parseInt(brTask3.readLine());
		System.out.println("Enter the call price of the second country (units per minute):");
		country2 = Integer.parseInt(brTask3.readLine());
		System.out.println("Enter the call price of the third country (units per minute):");
		country3 = Integer.parseInt(brTask3.readLine());

		System.out.println("Enter the call length of the first country (minutes):");
		time1 = Integer.parseInt(brTask3.readLine());
		System.out.println("Enter the call length of the second country (minutes):");
		time2 = Integer.parseInt(brTask3.readLine());
		System.out.println("Enter the call length of the third country  (minutes):");
		time3 = Integer.parseInt(brTask3.readLine());
		value1 = country1 * time1;
		value2 = country2 * time2;
		value3 = country3 * time3;
		sum = value1 + value2 + value3;
		System.out.println("The value of the first  country call is: " + value1 + " units");
		System.out.println("The value of the second country call is: " + value2 + " units");
		System.out.println("The value of the third  country call is: " + value3 + " units");
		System.out.println("________________________________________________");
		System.out.println("The value of the all calls           is: " + sum + " units");
		System.out.println();

	}

}

package HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork3_Topol {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1 task:");
		System.out.println("read 3 float numbers and check: are they all belong to the range [-5,5]");
		System.out.println("Enter 1st number");
		float number1 = Float.parseFloat(br.readLine());
		System.out.println("Enter 2nd number");
		float number2 = Float.parseFloat(br.readLine());
		System.out.println("Enter 3rd number");
		float number3 = Float.parseFloat(br.readLine());
		if ((number1 >= (-5) && number1 <= 5) && (number2 >= (-5) && number2 <= 5) && (number3 >= (-5) && number3 <= 5)) {
			System.out.println("All numbers belong to the range [-5,5]");
		} else {
			System.out.println("At least one of these numbers don't belong to the range [-5,5]");
		}

		System.out.println("2 task:");
		System.out.println("read 3 integer numbers and write max and min of them;");

		// TODO Auto-generated method stub
		int max = 0;
		int maxItem = 1;
		int min = 0;
		int minItem = 1;

		System.out.println("Enter 1st number");
		int number2_1 = Integer.parseInt(br.readLine());
		max = number2_1;
		min = number2_1;
		System.out.println("Enter 2st number");
		int number2_2 = Integer.parseInt(br.readLine());
		if (number2_2 > max) {
			max = number2_2;
			maxItem = 2;
		}
		if (number2_2 < min) {
			min = number2_2;
			minItem = 2;
		}
		System.out.println("Enter 3st number");
		int number2_3 = Integer.parseInt(br.readLine());
		if (number2_3 > max) {
			max = number2_3;
			maxItem = 3;
		}
		if (number2_3 < min) {
			min = number2_3;
			minItem = 3;
		}
		System.out.println("Maximum of 3 numbers is:" + max);
		System.out.println("It's " + maxItem+ " number");
		System.out.println("Minimum of 3 numbers is:" + min);
		System.out.println("It's " + minItem+ " number");
		
		System.out.println("3 task:");

		String dogName = "";
		int oldAge = 0;
		int numDog = 1;


		Dog dog1 = new Dog("Bobik", breed.BORDER_COLLIE, 7);
		oldAge = dog1.getAge();
		Dog dog2 = new Dog("Sharik", breed.GOLDEN_RETRIEVER, 5);
		if (oldAge < dog2.getAge()) {
			oldAge = dog2.getAge();
			numDog = 2;
		}
		Dog dog3 = new Dog("May", breed.DOBERMAN_PINSCHER, 3);

		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
		System.out.println(dog3.toString());

		if (oldAge < dog3.getAge()) {
			oldAge = dog3.getAge();
			numDog = 3;
		}
		if ((dog1.getName() != dog2.getName()) && (dog3.getName() != dog2.getName())) {
			System.out.println("All dogs have another names");
		} else {
			System.out.println("Some dogs have the same name");
		}
		
		System.out.println("The oldest dog is: ");
		if ((dog1.getAge() > dog2.getAge()) && (dog1.getAge() > dog3.getAge())) {
			System.out.println(dog1.toString());
		}
		if ((dog2.getAge() > dog1.getAge()) && (dog2.getAge() > dog3.getAge())) {
			System.out.println(dog2.toString());
		}
		if ((dog3.getAge() > dog1.getAge()) && (dog3.getAge() > dog2.getAge())) {

			System.out.println(dog3.toString());
		}
		System.out.println("Enter number of error (400, 401...405)");
		int errNumber = Integer.parseInt(br.readLine());
		System.out.println("Error:");
	switch (errNumber) {	
	case 400:
			System.out.println(HTTPError.BAD_REQUEST);
			break;
	case 404:
		System.out.println(HTTPError.FORBIDDEN);
		break;
	case 403:
		System.out.println(HTTPError.NOT_FOUND);
		break;
	case 402:
		System.out.println(HTTPError.PAYMENT_REQUIRED);
		break;
	case 401:
		System.out.println(HTTPError.UNAUTHORIZED);
		break;
	default:
		System.out.println("Sorry, we have not such error in our base");
		break;
	}
			
			
		
		
		
		
		
	}

}

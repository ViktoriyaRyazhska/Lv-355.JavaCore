package lastPracticalPart;

import java.util.Scanner;

public class Task_2 {
	
	public static void Decompose() {
		int currentValue = 0;
		int mult = 2;
		String decompose = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want to decompose: ");
		int number = sc.nextInt();
		currentValue = number;
		sc.close();
		while (mult <= currentValue){
		    if (currentValue % mult == 0){
		        decompose += mult + " ";
		        currentValue /= mult;
		    }
		    else if (mult == 2){	
		        mult++;
		    }
		    else{
		        mult += 2;
		    }
		}
		System.out.println("Result: " + decompose);
	}
}
package lastPracticalPart;

import java.util.Scanner;

public class Task_11 {
	
	public static void Cards() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of your card: ");
		String number = sc.nextLine();
		sc.close();
		boolean y = true;
		
		String visa = "4";
		String[] masterCard = {"51", "52","53", "54", "55"};
		String[] americanExpress = {"34", "37"};
		
		String two = number.substring(0,2);
		
		if(number.startsWith(visa)) {
			System.out.println(Cards.Visa);
			y = false;
		}
		for(int i = 0; i < masterCard.length; i++) {
			if(masterCard[i].equals(two)) {
				System.out.println(Cards.MasterCard);
				y = false;
			}
		}
		for(int i = 0; i < americanExpress.length; i++) {
			if(americanExpress[i].equals(two)) {
				System.out.println(Cards.American_Express);
				y = false;
			}
		}
		if(y) {
			System.out.println("Unknown card!");
		}
		
	}
	
	
}

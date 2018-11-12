package lastPracticalPart;

import java.util.Scanner;

public class Task_5 {
	
	public static void Polindrome() {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		char[] strToChar = s.toCharArray();
		boolean y = true;
		for(int i = 0; i < strToChar.length/2; i++) {
			if(strToChar[i] != strToChar[strToChar.length - i - 1]) {
				System.out.println("Entered string isnt polindrome");
				y = false;
				break;
			}
		}
		if(y) {
			System.out.println("Entered string is polindrome");
		}
		
		
	}
	
}

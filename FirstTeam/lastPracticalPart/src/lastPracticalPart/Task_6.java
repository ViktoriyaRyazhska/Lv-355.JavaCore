package lastPracticalPart;

import java.util.Scanner;

public class Task_6 {
	
	public static void CountOfWords() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		String[] arr = s.split(" ");
		System.out.println("Count of words: " + arr.length);
	}
	
}

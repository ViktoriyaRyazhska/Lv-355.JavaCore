import java.util.Scanner;

public class Task_1 {

	public static String longest(String[] s) {
		
		String longs = s[0];
		for (int i = 1; i < s.length; i++) {
			if(longs.length() < s[i].length()) {
				longs = s[i];
			}
		}
		return longs;
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence of five words: ");
		String ss =	sc.nextLine();
		sc.close();
		
		System.out.print("Your sentence is: ");
		String[] s = ss.split(" ");
		for (String string : s) {
			System.out.print(string + " ");
		}
		
		System.out.println();
		System.out.println("The longest word is: " + longest(s)); 
		System.out.println("The number of letters the longest word is: " + longest(s).length()); 
		
		for (int i = 0; i < s.length; i++) {
			if(i == 1) {
				s[i] = new StringBuffer(s[i]).reverse().toString();
			}
			System.out.print(s[i] + " ");
		}
	}

}

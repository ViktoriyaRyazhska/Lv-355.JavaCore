package FinalWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {

	public static void main(String[] args) throws IOException {
		String original;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string to check It: ");
		original = br.readLine();
		
		System.out.println(palindromeCheck(original));
	}
	
		public static String palindromeCheck(String original) {
		StringBuffer Name = new StringBuffer(original);
		Name.reverse();
		
		if (Name.toString().equals(original)) {
			return "The String is a Palindrome";
		}else {
			return "Not a Palindrom!";
		}
	}

}

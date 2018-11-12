package FinalWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your String");
		String input = br.readLine();
		//String[] words = input.trim().split("\\s+");
		int words = input.split("\\w+").length;
		//System.out.println("Words in the string are : " + (words.length));
		System.out.println("Words in the string are: " + words);
	}

}
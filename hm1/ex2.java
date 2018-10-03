package hm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2 {
public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name?");
		String name = br.readLine();
		System.out.println("Where are you live, " + name + "?");
		String city = br.readLine();
		System.out.println("You live in " + city + ", " + name + "!");
	}
}
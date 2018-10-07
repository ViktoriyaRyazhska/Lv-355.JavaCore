package softServeFirstHomeTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondTask {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader mt = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name?");
		String name = mt.readLine();
		System.out.println("Where are you live, " + name + "?");
		String address = mt.readLine();
		System.out.println("I live on " + address + " street");
	}
}
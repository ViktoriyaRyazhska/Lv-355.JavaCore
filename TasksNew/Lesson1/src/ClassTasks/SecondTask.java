package ClassTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondTask {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer;
		System.out.println("How are you?");
		answer = br.readLine();
System.out.println("You are " + answer);
	}

}


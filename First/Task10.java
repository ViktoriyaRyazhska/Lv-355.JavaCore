package firstTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
	public static void task10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number");
		int number = Integer.parseInt(br.readLine());
		int count = 0;
		while (number != 1) {
			if (number % 2 == 0) {
				number = number / 2;
				count++;
			} else {
				number = number * 3 + 1;
				count++;
			}
		}
		System.out.println(count);
	}
}

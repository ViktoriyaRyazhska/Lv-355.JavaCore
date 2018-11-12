package firstTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void task1() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Imput number");
		int number = Integer.parseInt(br.readLine());
		int fibonacci[] = new int[number];
		fibonacci[0] = 1;
		System.out.print(fibonacci[0] + " ");
		fibonacci[1] = 1;
		System.out.print(fibonacci[1] + " ");
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			System.out.print(fibonacci[i] + " ");
		}

	}
}
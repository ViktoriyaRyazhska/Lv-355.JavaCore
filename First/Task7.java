package firstTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {

	public static void task7() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number");
		int n = Integer.parseInt(br.readLine());
		if (n > 0) {
			int sum = 1;
			for (int i = 1; i < n; i++) {
				sum = sum * (i + 1);
			}
			System.out.println(sum);
		} else {
			System.out.println(0);
		}
	}
}

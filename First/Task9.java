package firstTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
	public static void task9() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number");
		int times = Integer.parseInt(br.readLine());
		int count = 0;
		int zeroOne[] = new int[times];
		for (int i = 0; i < zeroOne.length; i++) {
			zeroOne[i] = (int) (Math.random() * 2);
			if (zeroOne[i] == 1) {
				count++;
			}
		}
		System.out.println(count);
	}
}

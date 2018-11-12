package firstTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
	public static void task3() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write price of dollar");
		int dollarPrice = Integer.parseInt(br.readLine());
		System.out.println("How much gryvnas do you have?");
		int yourGryvnas = Integer.parseInt(br.readLine());
		if (yourGryvnas % dollarPrice == 0) {
			System.out.println("From " + yourGryvnas + " gryvnas you can have " + yourGryvnas / dollarPrice + "$");
		} else if (yourGryvnas < dollarPrice) {
			System.out.println("From " + yourGryvnas + " gryvnas you cannot have any dollars:(");
		} else {
			System.out.println("From " + yourGryvnas + " gryvnas you can have " + yourGryvnas / dollarPrice + "$ and "
					+ yourGryvnas % dollarPrice + " gryvnas");
		}

	}
}

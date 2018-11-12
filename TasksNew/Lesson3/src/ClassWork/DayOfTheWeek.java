package ClassWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfTheWeek {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTheDay;
		numberOfTheDay = Integer.parseInt(br.readLine());
				switch (numberOfTheDay) {
		case 1: 
			System.out.println("Понеділок");
			break;
		case 2:
			System.out.println("Вівторок");
			break;
		case 3:
			System.out.println("Середа");
			break;
		case 4:
			System.out.println("Четверг");
			break;
		case 5:
			System.out.println("Пятниця");
			break;
		case 6:
			System.out.println("Субота");
			break;
		case 7:
			System.out.println("Неділя");
			break;
			default:
				System.out.println("Please check what you entered!");
	}
}
}


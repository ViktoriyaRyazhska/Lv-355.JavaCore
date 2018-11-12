package first.team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTeam {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int myExit = 1;
		do {
			System.out.println();
			System.out.println("Enter the number of task (1-14). 0 - in case of exit:");
			int choise=1;
			try {
				choise = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			myExit = choise;
				System.out.println();
			
			switch (choise) {
			case 1:
				System.out.println("Task 1:");
				break;
			
			case 2:
				System.out.println("Task 2:");
				break;
			case 3:
				System.out.println("Task 3:");
				break;
			case 4:
				System.out.println("Task 4:");
				break;
			case 5:
				System.out.println("Task 5:");
				break;
			case 6:
				System.out.println("Task 6:");
				break;
			case 7:
				System.out.println("Task 7:");
				break;
			case 8:
				System.out.println("Task 8:");
				break;
			case 9:
				System.out.println("Task 9:");
				break;
			case 10:
				System.out.println("Task 10:");
				break;
			case 11:
				System.out.println("Task 11:");
				break;
			case 12:
				System.out.println("Task 12:");
				break;
			case 13:
				System.out.println("Task 13:");
				break;
			case 14:
				System.out.println("Task 14:");
				break;
			default:
				System.out.println("We have only 14 tasks");
				break;
			}
		} while (myExit != 0);
	}

}

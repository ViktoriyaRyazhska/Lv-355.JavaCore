import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntryPoint {


	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int exit = 1;
		do {
					System.out.println();
			System.out.println("Enter the number of task (1-14). 0 - in case of exit:");
			int choise = 0;
			
			try {
				choise = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			exit = choise;
				System.out.println();
			
			switch (choise) {
			case 1:
				System.out.println("Task 1:");
				try {
					Task1.start();
				} catch (NumberFormatException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				break;
			
			case 2:
				System.out.println("Task 2:");
				try {
					Task2.start();
				} catch (IOException e) {
					
					e.printStackTrace();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Task 3:");
				try {
					Task3.start();
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("Task 4:");
				Task4.start();
				break;
			case 5:
				System.out.println("Task 5:");
				try {
					Task5.start();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 6:
				System.out.println("Task 6:");
				try {
					Task6.start();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 7:
				System.out.println("Task 7:");
				try {
					Task7.start();
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 8:
				System.out.println("Task 8:");
				try {
					Task8.start();
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 9:
				System.out.println("Task 9:");
				Task9.start();
				break;
			case 10:
				System.out.println("Task 10:");
				Task10.start();
				break;
			case 11:
				System.out.println("Task 11:");
				Task11.start();
				break;
			case 12:
				System.out.println("Task 12:");
				Task12.start();
				break;
			case 13:
				System.out.println("Task 13:");
				Task13.start();
				break;
			case 14:
				System.out.println("Task 14:");
				System.out.println("ooops");
				break;
			default:
				System.out.println("Thank you! Have a great day!");
				break;
			}
		}
			while (exit != 0);
			
		}
}


	
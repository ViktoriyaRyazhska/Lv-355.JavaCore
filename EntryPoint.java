
public class EntryPoint {


	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int myExit = 1;
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
				Task1.start();
				break;
			
			case 2:
				System.out.println("Task 2:");
				Task2.start()
				break;
			case 3:
				System.out.println("Task 3:");
				Task3.start();
				break;
			case 4:
				System.out.println("Task 4:");
				Task4.start();
				break;
			case 5:
				System.out.println("Task 5:");
				Task5.start();
				break;
			case 6:
				System.out.println("Task 6:");
				Task6.start();
				break;
			case 7:
				System.out.println("Task 7:");
				Task7.start();
				break;
			case 8:
				System.out.println("Task 8:");
				Task8.start();
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
				Task14.start();
				break;
			default:
				System.out.println("We have only 14 tasks");
				break;
			}
		}
}
	
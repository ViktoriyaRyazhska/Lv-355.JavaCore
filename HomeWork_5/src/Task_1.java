import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  
		int month = sc.nextInt();
		
		for (int i = 0; i < months.length; i++) {
			if(month-1 == i)
				System.out.println("Amount of days: " + months[i]);
		}
	
		sc.close();

	}

}

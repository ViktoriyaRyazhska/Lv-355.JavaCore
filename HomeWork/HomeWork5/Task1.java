import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws IOException {
		Task1 a = new Task1();
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println(a.Month(days));
	}

	public String Month(int[] days) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter the number of month(1-12)");
		int month = Integer.parseInt(reader.readLine());
		while(month>12||month<1) {
			System.out.println("Enter 1-12");
			month = Integer.parseInt(reader.readLine());
			
		}
		return "Days in your month:" + days[month - 1];
		

	}
}

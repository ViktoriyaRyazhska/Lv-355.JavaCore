import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int one = 1;
		System.out.println("Enter numbers:");
		int number = Integer.parseInt(reader.readLine());
		while (number > 0) {
			one *= number;
			number = Integer.parseInt(reader.readLine());
		}
		System.out.println("Product of your numbers"+" "+one);

	}

}

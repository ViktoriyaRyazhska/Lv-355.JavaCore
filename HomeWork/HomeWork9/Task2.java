import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException {
		int[] massive = new int[10];
		for (int i = 0; i < massive.length; i++) {
			try {
				readNumber(1, 100);
			} catch (NumberFormatException e) {
				System.err.println("You entered invalid number");
			} catch (IOException e) {
				System.err.println("You entered invalid number");

			}

		}
	}

	public static int readNumber(int start, int end) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(reader.readLine());

		if (a < start || a > end) {
			throw new IOException("enter another number");
		}
		return a;

	}
}

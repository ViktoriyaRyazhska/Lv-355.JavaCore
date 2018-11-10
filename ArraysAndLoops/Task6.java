
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

	public static void main(String[] args) {
		int[] massive = new int[4];
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < massive.length; i++) {
			while (true) {
				try {
					massive[i] = Integer.parseInt(reader.readLine());
					break;
				} catch (NumberFormatException | IOException e) {
					System.err.println("Enter number");
				}
			}
		}
		for (int i = 0; i < massive.length; i++) {
			System.out.print(massive[i] + " ");
		}
		System.out.println();
		int n = 0;
		int b = massive[0];
		for (int i = 0; i < massive.length - 1; i++) {
			if (b != massive[i]) {
				n = 0;
			} else if (massive[i] != massive[i + 1]) {
				i += 1;
				n = i;

			}
		}
		System.out.println(n);

	}
}

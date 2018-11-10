import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] massive = new int[3];
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
		if (massive[0] >= massive[1] + massive[2] || massive[1] >= massive[0] + massive[2]
				|| massive[2] >= massive[0] + massive[1]) {
			System.out.println("0");
		} else if (massive[0] == massive[1] && massive[0] == massive[2]) {
			System.out.println("3");
		} else if (massive[0] == massive[1] || massive[0] == massive[2] || massive[1] == massive[2]) {
			System.out.println("2");
		} else {
			System.out.println("1");
		}
	}
}

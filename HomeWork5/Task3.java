import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) throws IOException {
		Task3 t = new Task3();
		int[] numbers = new int[5];
		System.out.println("Enter 5 numbers");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(reader.readLine());
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println(t.getMinimum(numbers));
		System.out.println(t.getSecondPosisitive(numbers));

	}

	public String getMinimum(int[] numbers) {
		int min = numbers[0];
		int imin = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
				imin = i;
			}
		}
		imin += 1;
		return "Minimum is" + " " + min + " " + "Index of minimum is" + " " + imin;
	}

	public String getSecondPosisitive(int[] numbers) {
		int n = 0;
		int i = 0;
		int o = 0;
		for (i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				n++;
			}
			if (numbers[i] < 0) {
				o++;
			}
			if (o == 4 || o == 5) {
				return "no second positive number";
			}
			if (n == 2) {
				break;
			}
		}
		i += 1;
		return "Position of second positive number is:" + i;
	}

}

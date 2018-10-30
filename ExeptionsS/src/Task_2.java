import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_2 {

	private static int readNumber(int start, int end) throws MyException, NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number: ");

		int a = Integer.parseInt(br.readLine());

		if (a < start || a > end)
			throw new MyException("The number " + a + " isnt in range");
		return a;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				try {
					list.add(readNumber(1, 100));
				} catch (NumberFormatException | MyException | IOException e) {
					System.err.println("You entered invalid number");
					i--;
				}
			} else {
				try {
					list.add(readNumber(list.get(i - 1), 100));
				} catch (NumberFormatException | MyException | IOException e) {
					i--;
					System.err.println("You entered invalid number");
				}
			}
		}

		System.out.println("Hello");
	}

}

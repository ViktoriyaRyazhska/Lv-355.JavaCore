import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		try {
			
			System.out.println(squareRectangle(a, b));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

	public static int squareRectangle(int a, int b) throws ArithmeticException{

		int c = a * b;
		if (a < 0 || b < 0) {
			throw new ArithmeticException("Wrong");
		}
		return c;

	}

}

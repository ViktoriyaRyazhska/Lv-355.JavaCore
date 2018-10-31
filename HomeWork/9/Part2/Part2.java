package HomeWork9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Part2 {

	static int a;

	public static void readNumber(int start, int end) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number: ");
		try {
			a = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.err.println("Your input string");
		} catch (Exception e) {
			e.getMessage();
		}
		if (a < start || a > end) {
			System.err.println("The number is out of range");
		} else {
			System.out.println("The number in range");
		}
	}

	public static void main(String[] args) throws Exception {
		int[] inp = new int[2];
		for (int num = 0; num < inp.length; num++) {
			if (a >= 0) {
				readNumber(1, 100);
			} else {
				throw new Exception("Number < 0");
			}
		}
		System.out.println("Hello");
	}
}
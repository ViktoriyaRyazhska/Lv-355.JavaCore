package hm8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2 {
	public static void main(String[] args) throws IOException {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			try {
				arr[i] = readNumber(5, 9);
			} catch (NumberFormatException e1) {
				System.err.println("NumberFormatException");
			} catch (ArithmeticException e2) {
				System.err.println(e2.getMessage());
			}
		}
		
		System.out.println();
		System.out.println("It must work!!!");
	}

	public static int readNumber(int start, int end) throws NumberFormatException, IOException, ArithmeticException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number:");
		int x = Integer.parseInt(br.readLine());
		if ((start <= x) && (x <= end)) {
			System.out.println(x);
			return x;
		} else {
			throw new ArithmeticException("Your number must be on [5, 9]");
		}
	}
}

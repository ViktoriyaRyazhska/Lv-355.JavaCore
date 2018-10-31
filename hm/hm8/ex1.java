package hm8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1 {
	public static void main(String[] args) throws IOException {
		try {
			div();
		} catch (NumberFormatException e1) {
			System.err.println("NumberFormatException");
		} catch (ArithmeticException e2) {
			System.err.println(e2.getMessage());
		}
		System.out.println();
		System.out.println("It must work!!!");
	}

	public static double div() throws NumberFormatException, IOException, ArithmeticException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		double c = a / b;
		System.out.println(c);
		return c;
	}
}

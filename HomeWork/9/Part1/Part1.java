package HomeWork9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part1 {

	public static void div(double a, double b) throws ArithmeticException, NumberFormatException {
		if (a != 0 && b != 0) {
			double s = a / b;
			System.out.println("Result:" + s);
		} else {
			throw new ArithmeticException("You can't divide by ZERO");
		}

	}

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value A");
		double a = 0;
		try {
			a = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("You input string");
		} catch (IOException e) {
			e.getMessage();
		}
		System.out.println("Enter value B");
		double b = 0;
		try {
			b = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("You input string");
		} catch (IOException e) {
			e.getMessage();
		}

		try {
			div(a, b);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Hello");
	}
}

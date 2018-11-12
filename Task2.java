package FinalWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void primeFactors(int n) {
		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n /= 2;
		}

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				System.out.print(i + "*");
				n /= i;
			}
		}

		if (n > 2)
			System.out.print(n);
	}

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter numbers: ");
		int age = Integer.parseInt(br.readLine());
		primeFactors(age);
	}

}

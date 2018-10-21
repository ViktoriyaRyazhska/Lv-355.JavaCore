package hm3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1st number");
		int n1 = Integer.parseInt(br.readLine());
		System.out.println("2nd number");
		int n2 = Integer.parseInt(br.readLine());
		System.out.println("3rd number");
		int n3 = Integer.parseInt(br.readLine());

		max(n1, n2, n3);
		min(n1, n2, n3);
	}

	public static int max(int n1, int n2, int n3) {
		int maximum = n1;
		if ((n1 > n2) && (n1 > n3)) {
			System.out.println("max=" + n1);
		}
		if ((n2 > n1) && (n2 > n3)) {
			maximum = n2;
			System.out.println("max=" + n2);
		}
		if ((n3 > n2) && (n3 > n1)) {
			maximum = n3;
			System.out.println("max=" + n3);
		}
		return maximum;
	}

	public static int min(int n1, int n2, int n3) {
		int minimum = n1;
		if ((n1 < n2) && (n1 < n3)) {
			System.out.println("min=" + n1);
		}
		if ((n2 < n1) && (n2 < n3)) {
			minimum = n2;
			System.out.println("min=" + n2);
		}
		if ((n3 < n2) && (n3 < n1)) {
			minimum = n3;
			System.out.println("min=" + n3);
		}
		return minimum;
	}

}
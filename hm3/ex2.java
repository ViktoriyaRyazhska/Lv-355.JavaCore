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
		if ((n1 > n2) && (n1 > n3)) {
			System.out.println("max=" + n1);
		}
		if ((n2 > n1) && (n2 > n3)) {
			System.out.println("max=" + n2);
		}
		if ((n3 > n2) && (n3 > n1)) {
			System.out.println("max=" + n3);
		}
		if ((n1 < n2) && (n1 < n3)) {
			System.out.println("min=" + n1);
		}
		if ((n2 < n1) && (n2 < n3)) {
			System.out.println("min=" + n2);
		}
		if ((n3 < n2) && (n3 < n1)) {
			System.out.println("min=" + n3);
		}
	}
}

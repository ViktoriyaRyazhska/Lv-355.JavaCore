package TaskWithNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		if(a > b && a > c) {
			System.out.println("Max = " + a);
		}
		if (b > a && b > c) {
			System.out.println("Max = " + b);
		}
		if (c > a && c > b) {
			System.out.println("Max = " + c);
		}
 if (a < b && a < c) {
	System.out.println("Min = " + a);
}
 if (b < a && b < c) {
	 System.out.println("Min = " + b);
 }
 if (c < a && c < b) {
	 System.out.println("Min = " + c);
 }
}
}


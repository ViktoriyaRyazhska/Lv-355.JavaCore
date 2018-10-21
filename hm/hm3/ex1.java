package hm3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1st number");
		float n1 = Float.parseFloat(br.readLine());
		System.out.println("2nd number");
		float n2 = Float.parseFloat(br.readLine());
		System.out.println("3rd number");
		float n3 = Float.parseFloat(br.readLine());
		System.out.println(check(n1, n2, n3));
	}

	public static boolean check(float n1, float n2, float n3) {
		if ((n1 <= 5) && (n1 >= -5) && (n2 <= 5) && (n2 >= -5) && (n3 <= 5) && (n3 >= -5)) {
			return true;
		}
		return false;
	}
}
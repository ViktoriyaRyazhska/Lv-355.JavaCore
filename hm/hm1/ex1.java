package hm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Radius");
		int r = Integer.parseInt(br.readLine());
		double s = Math.PI * Math.pow(r, 2);
		double p = 2 * Math.PI * r;
		System.out.println("Square=" + s);
		System.out.println("Perimetr=" + p);
	}
}

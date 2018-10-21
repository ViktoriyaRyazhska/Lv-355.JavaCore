package hm4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int product = 1;
		System.out.println("Enter number");
		int a = Integer.parseInt(br.readLine());
		while (a >= 0) {
			product = product * a;
			System.out.println("Enter number");
			a = Integer.parseInt(br.readLine());
		}
		System.out.println(product);
//		int array[] = new int[20];	
//		int product=1;
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("Enter number");
//			array[i] = Integer.parseInt(br.readLine());
//			if (array[i]<0) {
//				break;
//			}
//			product=product*array[i];
//		}
//	System.out.println(product);
	}
}

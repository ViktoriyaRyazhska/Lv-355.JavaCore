package hm4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int array[] = new int[10];
		System.out.println("Enter ten numbers");
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}

		int amount = 0;
		int sum = 0;
		int product = 1;
		for (int i = 0; i <= 4; i++) {
			if (array[i] > 0) {
				sum = array[i] + sum;
				amount++;
			} else {
				for (int f = 5; f < array.length; f++) {
					product = product * array[f];
				}
				break;
			}
		}
		if (amount == 5) {
			System.out.println("Sun of first five elements:" + sum);
		} else {
			System.out.println("Product of last five elenents:" + product);
		}
	}
}

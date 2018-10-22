package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IntegerNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] array = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int prod = 1;
		System.out.println("Enter the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Now we will count the sum of first 5 int");
		for (int j = 0; j < (array.length) / 2; j++) {
			
			if (array[0] > 0 && array[1] > 0 && array[2] > 0 && array[3] > 0 && array[4] > 0) {
				sum += array[j];
			}
			
			
			

			else {
				for (int k = (array.length) / 2; k < array.length; k++) {

					prod *= array[k];
				}
				

			}

		}
		System.out.println("Sum : " + sum);
		System.out.println("Prod " + prod);

	}
}

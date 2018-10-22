package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class FiveINtegerNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[5];
		int tmp;
		int prod = 1;
		int position = 0; 
		int [] positive = new int [5];
		for (int i = 0; i<array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("You entered array: " + Arrays.toString(array));
		
		for (int i = 0; i < array.length; i++) {
		if (array[i] >= 0) {
				positive[position] = array[i];
				position++;
				}
		}
		System.out.println("Second positive number is: " + positive[1]);
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
System.out.println("Minimum number is: " + array[4]);
for (int i = 0; i < array.length; i++) {
	if (array[i]%2 == 0) {
		prod *= array[i];
	}
}
System.out.println("Prduct of all even numbers is: " + prod);
		}
	}







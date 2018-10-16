package hm4;

import java.io.IOException;

public class ex3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int number[] = { 3, -2, 5, 7, -4 };
		int ipositive = 0;
		int amount=0;
		for (int i = 0; i < number.length; i++) {
			if (number[i]>0) {
				amount++;
				if (amount==2) {
					ipositive=i;
					System.out.println("Position of second positive element: " + ipositive);
				}
			}	
		}
		int imin = 0;
		int min = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] < min) {
				min = number[i];
				imin = i;
			}
		}
		System.out.println("Minimum: " + min);
		System.out.println("Position of minimum: " + imin);
	}
}
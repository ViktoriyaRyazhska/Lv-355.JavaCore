package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] mas = new int[3];
		int max = mas[0];
		int min = mas[0];
		for(int i = 0; i < 3; i++) {
			System.out.print("Enter " + i + " number: ");
			mas[i] = Integer.parseInt(br.readLine());
			if(mas[i] > max)
				max = mas[i];
			if(mas[i] < min) 
				min = mas[i];
		}
		System.out.print("Max: " + max + ", min: " + min);
	}
}
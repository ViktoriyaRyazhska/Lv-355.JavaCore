package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float[] mas = new float[3];
		for(int i = 0; i < 3; i++) {
			System.out.print("Enter " + i +" number: ");
			mas[i] = Float.parseFloat(br.readLine());
			
			if(mas[i] > 5) {
				System.out.println(mas[i] + " >5");
			}else if(mas[i] < -5) {
				System.out.println(mas[i] + " <-5");
			}
			if (mas[i] >= -5 && mas[i] <=5)
				System.out.println(mas[i] + " is OK");
		}
		
	}
}
package HomeWork;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

public class FirstTask {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		double radius;
		double perimetr, area;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		radius = Double.parseDouble(br.readLine());
		perimetr = 2 * Math.PI * radius;
		area = Math.PI * radius * radius;
		System.out.println("Perimetr = " + perimetr);
		System.out.println("Area = " + area);
	}
}

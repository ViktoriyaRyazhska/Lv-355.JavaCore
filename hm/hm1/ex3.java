package hm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3 {
public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c1=5;
		int c2=10;
		int c3= 25;
		System.out.println("How long did you speake with 1st country?");
		double t1 = Double.parseDouble(br.readLine());
		double price1=c1*t1;
		System.out.println("Price the 1st call:" + price1);
		System.out.println("How long did you speake with 2nd country?");
		double t2 = Double.parseDouble(br.readLine());
		double price2=c2*t2;
		System.out.println("Price the 2nd call:" + price2);
		System.out.println("How long did you speake with 3rd country?");
		double t3 = Double.parseDouble(br.readLine());
		double price3=c3*t3;
		System.out.println("Price the 1st call:" + price3);
		double price=price1+price2+price3;
		System.out.println("General price:" + price);
	}
}

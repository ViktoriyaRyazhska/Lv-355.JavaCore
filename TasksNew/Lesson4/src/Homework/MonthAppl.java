package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonthAppl {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Month[] month = new Month[12];
		month[0] = new Month(31, "January");
		month[1] = new Month(28, "February");
		month[2] = new Month(31, "March");
		month[3] = new Month(30, "April");
		month[4] = new Month(31, "May");
		month[5] = new Month(30, "June");
		month[6] = new Month(31, "July");
		month[7] = new Month(31, "August");
		month[8] = new Month(30, "September");
		month[9] = new Month(31,"Octovber");
		month[10] = new Month(30, "November");
		month[11] = new Month(31, "December");
		System.out.println("Entrer number of the month");
		int n = Integer.parseInt(br.readLine());
		System.out.println(month[n - 1]);
	}
}

package hm4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Write the number of mounth");
		int n = Integer.parseInt(br.readLine());
		String mounthYear[] = new String[12];
		mounthYear[0] = "January";
		mounthYear[1] = "February";
		mounthYear[2] = "March";
		mounthYear[3] = "April";
		mounthYear[4] = "May";
		mounthYear[5] = "June";
		mounthYear[6] = "Jule";
		mounthYear[7] = "August";
		mounthYear[8] = "September";
		mounthYear[9] = "October";
		mounthYear[10] = "Nowember";
		mounthYear[11] = "December";
		int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.println(mounthYear[n - 1] + ": " + monthDays[n - 1] + " days");

	}
}

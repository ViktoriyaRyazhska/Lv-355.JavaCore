package TaskWithNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfTheWeek {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of the day in the week: ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Number entered: " + a);
	switch(a)	{
	case 1: 
		System.out.println("Monday/��������/�����������");
		break;
	case 2:
		System.out.println("Tuesday/³������/�������");
		break;
	case 3:
		System.out.println("Wednesday/������/�����");
		break;
	case 4:
		System.out.println("Thursday/������/�������");
		break;
	case 5:
		System.out.println("Friday/�������/�������");
		break;
	case 6:
		System.out.println("Saturday/������/������");
		break;
	case 7:
		System.out.println("Saunday/�����/�����������");
		break;
	}
}
}
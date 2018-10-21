package TopolHomework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class myTasksClass {

	public static void myMonth(int nMonth) {

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println(nMonth + " month has " + days[nMonth - 1] + " days");

	}

	public static void myCalc() throws NumberFormatException, IOException {
		final int n = 10; // size of array iNum
		int[] iNum = new int[n];
		boolean positivFlag = true;
		int sum = 0;
		int prod = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter " + n + " integer numbers:");
		for (int i = 0; i < n; i++) {
			iNum[i] = Integer.parseInt(br.readLine());
			if ((i < 5) && (iNum[i] < 0)) {
				positivFlag = false;
			}
			if (i < 5) {
				sum += iNum[i];
			} else {
				prod *= iNum[i];
			}
		}
		br.close();
		if (positivFlag) {
			System.out.println("Sum of 1-5 numbers is: " + sum);
		} else {
			System.out.println("Production of 6-10 numbers is: " + prod);
		}
	}

	public static void numberFind() throws NumberFormatException, IOException {

//		    3.Enter 5 integer numbers. Find
//				-position of second positive number;
//				-minimum and its position in the array.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int n = 5;
		int firstPosPosition = 0;
		int secondSecPosition = 0;
		int min;
		int minPosit = 0;
		int[] iNum = new int[n];
		for (int i = 0; i < iNum.length; i++) {
			System.out.print(i + 1 + ": ");
			iNum[i] = Integer.parseInt(br.readLine());

			if ((iNum[i] > 0) && (firstPosPosition < 2)) {
				firstPosPosition++;
				secondSecPosition = i;
			}

		}
		br.close();
		System.out.println("Position of the second positive number: " + (secondSecPosition + 1));
		min = iNum[0];
		for (int i = 0; i < iNum.length; i++) {
			if (min > iNum[i]) {
				min = iNum[i];
				minPosit = i;
			}
		}
		System.out.println("Minimum of the array: " + min + ". Its position in the array: " + (minPosit + 1));
	}

	public static void onlyPositive() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int n = 100;
		int[] iNum = new int[n];
		int prod1 = 1;
		int i = 0;
		while (i < iNum.length) {

			System.out.print("Enter " + (i + 1) + " number:");
			iNum[i] = Integer.parseInt(br.readLine());
			if (iNum[i] < 0) {
				if (prod1 == 1) {
					System.out.println("We have no even numbers in the array");
					break;
				} else {
					System.out.println("The product of all entered even numbers is: " + prod1);
					break;
				}
			} else if (iNum[i] % 2 == 0) {
				prod1 *= iNum[i];
			}
			i++;
			if (iNum[i] < 0) {
				br.close();
				break;

			}
		}
		br.close();
	}

}

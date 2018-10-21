package HomeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework53 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] inputtedNumber = new int[5];
		int min = inputtedNumber[0];
		int imin = 0;
		int pos = inputtedNumber[0];
		int ipos = 0;
		int i;
		int even = 0;
		for (i = 0; i < inputtedNumber.length; i++) {
			System.out.println("Введіть число: ");
			inputtedNumber[i] = Integer.parseInt(br.readLine());

			if (inputtedNumber[i] < min) {
				min = inputtedNumber[i];
				imin = i;
			}

//			if (inputtedNumber[i] < 0) {
//				System.out.println("Тільки додатні числа");
//				break;
//			}

			if ((inputtedNumber[i] % 2) == 0) {
				even++;
			}

			if (inputtedNumber[i] > 0) {
				if (pos > inputtedNumber[i]) {

					ipos = i;

				}
			}
		}
		System.out.println("Кількість парних чисел " + even);
		System.out.println("Позиція 2-го додатього числа " + ipos);//// ??? Не виходить визначити позицыю 2-го додатнього числа
		System.out.println("Мінімальне число: " + min + "\tЙого позиція: " + (imin + 1));
	}
}
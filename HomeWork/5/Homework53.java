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
			System.out.println("������ �����: ");
			inputtedNumber[i] = Integer.parseInt(br.readLine());

			if (inputtedNumber[i] < min) {
				min = inputtedNumber[i];
				imin = i;
			}

//			if (inputtedNumber[i] < 0) {
//				System.out.println("ҳ���� ������ �����");
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
		System.out.println("ʳ������ ������ ����� " + even);
		System.out.println("������� 2-�� ��������� ����� " + ipos);//// ??? �� �������� ��������� ������� 2-�� ���������� �����
		System.out.println("̳������� �����: " + min + "\t���� �������: " + (imin + 1));
	}
}
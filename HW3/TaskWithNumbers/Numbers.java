// �������� � ������� ��� ������ �� ������.
package TaskWithNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		System.out.println("����� ������� �����: " +a);
		System.out.println("����� ������� �����: " +b);
		System.out.println("���� ������� �����: " + c);
		if (a%2==0) {
			
				count++;
		}
					
		if (b%2==0) {
			count++;
		}
		if (c%2==0) {
			count++;
		}

System.out.println("������ �����: " + count);
	}

}

/*4.	������ ���������� �����  , ���� �����  �������� �� ����������� 
 * ���� ������������ ��������  �0, �0+�1, �0+...+�(n-1)
  */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number");
		int number = 0;
		while (true) {
			try {
				number = Integer.parseInt(reader.readLine());
				break;
			} catch (IOException | NumberFormatException e) {

				System.err.println("Enter number");
			}
		}
		System.out.println(number);
		System.out.println("Enter number less than " + number);
		int numLessN = 0;
		while (true) {
			try {
				numLessN = Integer.parseInt(reader.readLine());
				break;
			} catch (IOException | NumberFormatException e) {

				System.err.println("Enter number");
			}
		}
		System.out.println(numLessN);
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = numLessN; i < number; i++) {
			list.add(i);
		}
		int sum=0;
		for (Integer list2 : list) {
			System.out.print(list2+" ");
			sum = sum + list2;
			System.out.println(sum);
		}
		
	}

}

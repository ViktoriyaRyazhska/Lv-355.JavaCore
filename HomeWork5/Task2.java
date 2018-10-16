import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException {
		Task2 t = new Task2();
		int[] a = new int[10];
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 10 numbers");
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(reader.readLine());
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println(t.sumAction(a));
		for (int i = 0; i < 5; i++) {
			if (a[i] < 0) {
				System.out.println(t.productAction(a));
			}
		}
	}

	public String sumAction(int[] a) {
		int n = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] > 0) {

				n += a[i];
			}
			if (a[i] < 0) {
				return "There is negative number in first 5 elements";
			}
		}
		return "The sum of 5 first numbers:" + " " + n;
	}

	public String productAction(int[] a) {
		int n = 1;
		for (int i = 0; i < 5; i++) {
			if (a[i] < 0) {
				for (int j = 5; j < a.length; j++) {
					n *= a[j];
				}
			}
		}
		return "Multipluing:" + " " + n;
	}

}

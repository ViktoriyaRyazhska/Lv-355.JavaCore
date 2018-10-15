import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practical {

	public static void main(String[] args) throws IOException {
		Practical task1 = new Practical();
		int[] massive = new int[10];
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < massive.length; i++) {
			massive[i] = Integer.parseInt(reader.readLine());
		}
		for (int i = 0; i < massive.length; i++) {
			System.out.print(massive[i] + " ");
		}
		System.out.println();
		System.out.println("The biggest number is:" + " " + task1.TheBiggestNumber(massive));
		System.out.println("The summ of positive numbers is:" + " " + task1.TheSumOfPositive(massive));
		System.out.println("The amount of negative numbers:" + " " + task1.AmountOfNegative(massive));
		System.out.println(task1.ValuesMore(massive));
	}

	public int TheBiggestNumber(int[] massive) {
		int max = massive[0];
		for (int i = 0; i < massive.length; i++) {
			if (massive[i] > max) {
				max = massive[i];
			}
		}
		return max;
	}

	public int TheSumOfPositive(int[] massive) {
		int m = massive[0];
		for (int i = 0; i < massive.length; i++) {
			if (massive[i] > 0) {
				m += massive[i];
			}
		}
		return m - massive[0];

	}

	public int AmountOfNegative(int[] massive) {
		int neg = 0;
		for (int i = 0; i < massive.length; i++) {
			if (massive[i] < 0) {
				neg++;
			}
		}
		return neg;
	}

	public String ValuesMore(int[] massive) {
		int pos = 0;
		int neg = 0;
		for (int i = 0; i < massive.length; i++) {
			if (massive[i] > 0) {
				pos++;
			} else if (massive[i] < 0) {
				neg++;
			}
		}
		if (pos > neg) {
			return "Positives are more:" + pos;
		}
		return "Negatives are more" + neg;
	}
}

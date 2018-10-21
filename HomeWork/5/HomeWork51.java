package HomeWork5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork51 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] inputtedNumber = new int[10];
		int sum = 0;
		for (int num = 0; num < inputtedNumber.length; num++) {
			System.out.println("¬вед≥ть число:");
			inputtedNumber[num] = Integer.parseInt(br.readLine());

			if (num < 5) {
				if (inputtedNumber[num] > 0) {
					sum += inputtedNumber[num];

				}
			}
		}
		System.out.println(sum);
	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("¬вед≥ть пор€дковий номер м≥с€ц€:");
		int num = Integer.parseInt(br.readLine());
		int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (0 <= num || num < 12) {
			System.out.println("ѕор€дковий номер м≥с€ц€ повинен починатись з 1 ≥ зак≥нчутьс€ 12");
		} else {
			int total = month_days[num - 1];
			System.out.println(total);
		}
	}

}
package TaskWithNumbers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTaskWithNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float a = Float.parseFloat(br.readLine());
		float b = Float.parseFloat(br.readLine());
		float c = Float.parseFloat(br.readLine());
		if(a > -5.0 && a < 5.0) {
			System.out.println("A is fine");
			}
		if (b > -5.0 && b < 5.0) {
			System.out.println("B is fine");
					}
		if (c > -5.0 && c < 5.0) {
		System.out.println("C is fine");
		}
	}
}

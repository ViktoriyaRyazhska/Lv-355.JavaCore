import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM4_Task1_1 {
	public static void main(String args[]) throws IOException {
		float a[] = new float[3];
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your nuber: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = Float.parseFloat(reader.readLine());
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
              IN(a);
	}

	public static void IN(float a[]) {
		System.out.println("Numbers that are less than 5 and more than -5:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > -5 && a[i] < 5) {
				System.out.println(a[i]);
			}
		}}}
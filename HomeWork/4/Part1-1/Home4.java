import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input 1-st number");
		float num1 = Float.parseFloat(br.readLine());
		convertRange(num1);
		System.out.println("Input 2-nd number");
		float num2 = Float.parseFloat(br.readLine());
		convertRange(num2);
		System.out.println("Input 3-rd number");
		float num3 = Float.parseFloat(br.readLine());
		convertRange(num3);
	}

	public static float convertRange(float number) {
		if (number >= -5 && number <= 5) {
			System.out.println("×èñëî " + number + " âõîäèòü â ä³àïàçîí äîïóñòèìèõ ÷èñåë");
		} else {
			System.out.println("×èñëî " + number + " íå âõîäèòü â ä³àïàçîí äîïóñòèìèõ ÷èñåë");
		}
		return number;

	}
}

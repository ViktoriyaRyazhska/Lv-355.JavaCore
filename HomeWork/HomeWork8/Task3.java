import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) throws IOException {
		String pattern = "\\$\\d+\\.\\d{0,2}";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] numbers = new String[3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = reader.readLine();
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for (int i = 0; i < numbers.length; i++) {
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(numbers[i]);
			if (m.matches()) {
				System.out.println("Good: "+numbers[i]);
			} else {
				System.out.println("Bad, enter again");
			}
		}
	}

}

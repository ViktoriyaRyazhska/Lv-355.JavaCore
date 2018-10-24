import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) throws IOException {
		String pattern = "[a-zA-Z0-9_-]{3,15}";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] s = new String[5];
		for (int i = 0; i < s.length; i++) {
			s[i] = reader.readLine();
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		for (int i = 0; i < s.length; i++) {
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(s[i]);
			if (m.matches()) {
				System.out.println(s[i] +" "+ "It is ok");
			}
			else {
			System.out.println("It is invalid name"+" "+s[i]);
		}}
	}

}

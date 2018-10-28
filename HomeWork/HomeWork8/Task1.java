import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();
		String[] s1 = s.split(" ");
		for (String str : s1) {
			System.out.println(str);
		}
		String h = "";
		int a = s1[0].length();
		for (int i = 0; i < 5; i++) {
			if (s1[i].length() > h.length()) {
				h = s1[i];
			}
		}
		System.out.println("The longest word: " + h);
		for (int i = 0; i < 5; i++) {
			if (a < s1[i].length()) {
				a = s1[i].length();
			}

		}
		System.out.println("Number of letters in longest word: " + a);
		StringBuilder b = new StringBuilder(s1[1]);
		b.reverse();
		String i = b.toString();
		System.out.println("The second word reversed: " + i);
	}

}

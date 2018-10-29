package HomeWork8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3 {

	public static void main(String[] args) throws IOException {
//		String pattern = ".*";
//		String pattern = "\\$+(\\d*)+(\\.)+(\\d{2})";
		String pattern = "\\$\\d+\\.\\d{0,2}";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inp = new String[3];
		System.out.println("Enter $: ");
		for (int num = 0; num < inp.length; num++) {
			inp[num] = br.readLine();
		}

		for (int i = 0; i < inp.length; i++) {

			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(inp[i]);

			if (m.find()) {
				System.out.println("Matches: " + inp[i].substring(m.start(), m.end()));
			}
		}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			 line = reader.readLine();
		} catch (IOException e) {
		
		}
		int zero=0;
		Pattern p = Pattern.compile("[aeijuyo]");
		Matcher m = p.matcher(line);
		for(int i = 0;i<line.length();i++) {
		if(m.find()) {
			zero++;
		}}
		System.out.println(zero);
		
}}

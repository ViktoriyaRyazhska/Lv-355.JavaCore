import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_3 {

	public static void main(String[] args) {
		
		String[] s = {"$400.00", "$100,25","$ABC,25", "$100. 25", "100.25"};
		String pattern = "\\$+(\\d)+(\\.\\d{2})";
		Pattern p = Pattern.compile(pattern);
		for (String ss : s) {
			Matcher m = p.matcher(ss);
			System.out.println(ss + " -- " + m.matches());
		}
	}

}

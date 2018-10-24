import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
public static void main(String [] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter first string");
	String first = reader.readLine();
	System.out.println("Enter second string");
	String second = reader.readLine();
	if(first.contains(second)||second.contains(first)) {
		System.out.println(true);
	}
}
}

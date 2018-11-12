import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int a = Integer.parseInt(reader.readLine());
	int b = 1;
	for( int i = 1;i<=a;i++) {
		b*=i;
	}
	System.out.println(b);
	}

}

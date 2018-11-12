import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {

	public static void main(String[] args) {
		BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		try {
			System.out.println("Enter number more than 1");
		 a = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int b=0;
		int c=1;
		while(a!=1) {
		if(a%2==0) {
			a = a/2;
		}
		
		else {
			a = a*3+1;
		}
		b++;
		}
		System.out.println(b);

	}

}

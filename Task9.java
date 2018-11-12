import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a=0;
		try {
			a = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			
		} catch (IOException e) {
			
		}
		int zero = 0;
	for(int i =0;i<a;i++) {
		int n = rand();
		System.out.println(n);
		if(n==1) {
			zero++;
		}
	}
	System.out.println();
	System.out.println(zero);
		}
		public static int rand() {
			double rand =Math.random()*2;
			return (int) rand;
			
		}

	}


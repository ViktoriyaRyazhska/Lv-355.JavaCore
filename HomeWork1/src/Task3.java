import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] t = new int[3];
		double[] c = new double[3];
		double costt = 0;
		double[] cost = new double[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("c" + (i+1) + ": ");
			c[i] = Double.parseDouble(br.readLine());
			System.out.println("t" + (i+1) + ": ");
			t[i] = Integer.parseInt(br.readLine());
			cost[i] = c[i] * t[i];
			costt = cost[i];
			System.out.println();
			if(i == 2) {
				System.out.println("All cost: " + costt);
			}
		}
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void start() throws NumberFormatException, IOException {
		{    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		int a = 0;
		int b = 0;
		int c = 1;
                System.out.print("Enter value of n:");
        n = Integer.parseInt(br.readLine());
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
	}

}
}
}
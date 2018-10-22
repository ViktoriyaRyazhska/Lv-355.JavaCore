package ClassTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, sum, mnozh, dil, vid;
		System.out.println("Enter a");
  a = Integer.parseInt(br.readLine());
  System.out.println("Enter b");
  b = Integer.parseInt(br.readLine());
  sum = a + b;
  mnozh = a * b;
  dil = a / b;
  vid = a - b;
  System.out.println("Suma = " + sum);
  System.out.println("Mnozhennia = " + mnozh);
  System.out.println("Dilennia = " + dil);
  System.out.println("Vidnimannia = " + vid);
	}

}

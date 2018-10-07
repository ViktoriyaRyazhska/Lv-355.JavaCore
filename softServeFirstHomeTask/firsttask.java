package softServeFirstHomeTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class firsttask {
public static void main(String[] args) throws IOException {
	
		double p = 3.14;
		BufferedReader mt = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter flower bed radius");
		double r = Double.parseDouble(mt.readLine());
		double perimetr = 2 * p * r;
		double area = p * (r * r);
		System.out.println("Perimetr = " + perimetr);
		System.out.println("Area = " + area);
}
}

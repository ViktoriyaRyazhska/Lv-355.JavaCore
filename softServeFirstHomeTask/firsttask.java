package softServeFirstHomeTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class firsttask {
public static void main(String[] args) throws IOException {
	
		
		BufferedReader mt = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter flower bed radius");
		double r = Double.parseDouble(mt.readLine());
		double perimetr = 2 * Math.PI * r;
		double area = Math.PI * (r * r);
		System.out.println("Perimetr = " + perimetr);
		System.out.println("Area = " + area);
}
}

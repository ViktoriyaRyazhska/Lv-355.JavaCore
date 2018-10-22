package ClassWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
	public static void main(String[] args) throws IOException {
		int odd = 0;
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the first number");
int a = Integer.parseInt(br.readLine());
System.out.println("Enter the second number");
int b = Integer.parseInt(br.readLine());
System.out.println("Enter the third number");
int c = Integer.parseInt(br.readLine()); 
if (a%2!=0) {
	odd++;
}
if (b%2!=0) {
	odd++;
}
if (c%2!=0) {
	odd++;
}
System.out.println("Number of odd digits is: " + odd);
	}
}



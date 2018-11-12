import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Task_1 {

	private static double div(double a, double b) throws ArithmeticException{
		
		if(b == 0)
			throw new ArithmeticException("b == 0");
		
		return a / b;
	}

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Scanner sc = new Scanner(System.in);
		
		try {
			
			double a = Double.parseDouble(br.readLine());
			double b = Double.parseDouble(br.readLine());
//			double a = sc.nextDouble();
//			double b = sc.nextDouble();
			double result = div(a, b);
			System.out.println(result);
		}catch(NumberFormatException | IOException e){
			System.err.println("You must enter the number");
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("Hello");
		//sc.close();

	}

}

package softServeFirstHomeTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class ThirdTask {
	public static void main(String[] args) throws IOException {
		
	BufferedReader mt = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter duration and cost for the first call");
		double t1 = Double.parseDouble(mt.readLine());
		double c1 = Double.parseDouble(mt.readLine());
		double cost = t1 * c1;
		System.out.println("Cost is " + cost);
		System.out.println("Please enter duration and cost for the second call");
		double t2 = Double.parseDouble(mt.readLine());
		double c2 = Double.parseDouble(mt.readLine());
		double costSecond = t2 * c2;
		System.out.println("Cost is " + costSecond);
		System.out.println("Please enter duration and cost for the third call");
		double t3 = Double.parseDouble(mt.readLine());
		double c3 = Double.parseDouble(mt.readLine());
		double costThird = t3 * c3;
		System.out.println("Cost is " + costThird);
		double toatlCost = (int) (cost + costSecond + costThird);
		System.out.println("Total cost is: " + toatlCost );
	
	}
	}



	
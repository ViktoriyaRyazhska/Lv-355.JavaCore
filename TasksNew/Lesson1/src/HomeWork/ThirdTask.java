package HomeWork;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirdTask {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int c1, c2, c3;
		int t1, t2, t3;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int call1, call2, call3, callsTogether;
		System.out.println("Enter duration and cost for the first call");
		System.out.println("Enter duration and cost for the second call");
		System.out.println("Enter the duration and cost for the third call");
		 c1 = Integer.parseInt(br.readLine());
		 c2 = Integer.parseInt(br.readLine());
		 c3 = Integer.parseInt(br.readLine());
		 t1 = Integer.parseInt(br.readLine());
		 t2 = Integer.parseInt(br.readLine());
		 t3 = Integer.parseInt(br.readLine());
		call1 = c1 * t1;
		call2 = c2 * t2;
		call3 = c3 * t3;
		callsTogether = call1 + call2 + call3;
		
		
		System.out.println("Firt calls cost = " + call1);
		System.out.println("Second call cost = " + call2);
		System.out.println("Third call cost = " + call3);
		System.out.println("Total cost = " + callsTogether);
		
	}

}

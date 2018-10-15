package maxmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maxmin {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        int[] inputtedNumber = new int[3];

	        for (int num = 0; num < 3; num++) {
	        	System.out.println("¬ведите число:");
	            inputtedNumber[num] = Integer.parseInt(br.readLine());
	        }

	        int maxNum = Integer.MIN_VALUE; 
	        int minNum = Integer.MAX_VALUE;

	        for (int checkNum = 0; checkNum < 3; checkNum++) {
	            maxNum = Math.max(inputtedNumber[checkNum], maxNum);
	            minNum = Math.min(inputtedNumber[checkNum], minNum);
	        }

	        System.out.println("The maximum number: " + maxNum);
	        System.out.println("The minimum number: " + minNum);
	    }
}


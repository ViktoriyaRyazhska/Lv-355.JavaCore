package ClassWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskWithENum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Continents continent;
		String country;
		country = br.readLine();
		switch(country) {
		case "Egypt":
			System.out.println(Continents.AFRICA);
		break;
		case "Ukraine":
			System.out.println(Continents.EUROPE );
			break;
		case "China":
			System.out.println(Continents.ASIA );
			break;
		case "USA":
			System.out.println(Continents.NORTHAMERICA );
			break;
		case "Venesuela":
			System.out.println(Continents.SOUTHAMERICA );
			break;
		case "Australia":
			System.out.println(Continents.AUSTRALIA );
			break;
		case "Antarctica":
			System.out.println(Continents.ANTARCTICA );
		}
		
	}
}

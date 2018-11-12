package Countries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Countries {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter name of the country");
		String country = br.readLine();
		 Continents continent;
		switch (country.toLowerCase()) {
		case "hong Kong":  
		continent = Continents.Eurazia;
		break;
		case "namibia": 	
		continent = Continents.Africa;
		break;
		case "hamilton": 	
		continent = Continents.SoutAmerika;
		break;
		case "peru": 
		continent = Continents.NorthAmerika;
		break;
		case "antarctic": 
		continent = Continents.Antarctic;
		break;
		case "vanuatu": 
		continent = Continents.Australia;
		break;
		default: continent = Continents.WHOKNOWS; 
		
		
		
		
		}
		System.out.println(continent);
	}

}

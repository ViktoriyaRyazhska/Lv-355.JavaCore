import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task33 {
public static void main(String [] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String s = reader.readLine();
	Task333 continent=null;
	switch(s.toLowerCase()) {
	case "ukraine":
	case "poland":
	case"czech":
		continent = Task333.Europe;
		break;
	case "armenia":
	case "irak":
	case"iran":
		continent = Task333.Asia;
		break;
	case "nigeria":
	case "kenia":
	case"uganda":
		continent = Task333.Africa;
		break;
	case "nova zelandia":
	case "figi":
	case"australia":
		continent = Task333.Australia;
		break;
		
	}
	System.out.println(continent);
	
}
}

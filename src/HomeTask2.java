import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask2 {
public static void main(String args[]) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("What is your name?");
	String name = reader.readLine();
	System.out.println("Where are you live," +" "+ name+"?");
	String address = reader.readLine();
	System.out.println(name+" "+ "lives on"+" "+address);
}
}

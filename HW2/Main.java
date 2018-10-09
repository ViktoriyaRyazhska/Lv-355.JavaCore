import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		person1.input(reader);
		person2.input(reader);
		person3.input(reader);
		person4.input(reader);
		person5.input(reader);
		person1.setName("anton");
		System.out.println(person1+" "+"Â³ê"+" "+person1.age());
		System.out.println(person2+" "+"Â³ê"+" "+person2.age());
		System.out.println(person3+" "+"Â³ê"+" "+person3.age());
		System.out.println(person4+" "+"Â³ê"+" "+person4.age());
		System.out.println(person5+" "+"Â³ê"+" "+person5.age());
		
	}
}

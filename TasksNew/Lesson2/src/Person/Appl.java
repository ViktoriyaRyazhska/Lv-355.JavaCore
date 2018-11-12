package Person;

import java.io.IOException;

public class Appl {

	public static void main(String[] args) throws IOException {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		p1.input();
		System.out.println(p1.getBirthYear());
		p1.changeName();
		System.out.println(p1.getName());
		p2.input();
		p3.input();
		p4.input();
		p5.input();
		System.out.println(p5.output());
		System.out.println(p4.output());
		System.out.println(p3.output());
		System.out.println(p2.output());
		System.out.println(p1.output());
	}

}

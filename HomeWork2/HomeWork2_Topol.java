import java.io.IOException;

public class HomeWork2_Topol {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Person p1 = new Person ("Ann", 1989);
		Person p2 = new Person ("Maryn", 1999);
		Person p3 = new Person ("Peter", 1990);
		Person p4 = new Person ("Alex", 1988);
		Person p5 = new Person ("Diana", 2000);
		
		
		System.out.println(p1.getName()+" has "+ p1.myAge(p1.getBirthYear())+" years");
		p2.input();
		System.out.println(p2.getName()+" was born in "+ p2.getBirthYear() +" year");
		System.out.println(p3.output());
		p4.changeName();
		System.out.println(p4.output());		
		System.out.println(p5.output());
		
		
		
		
		
	}

}

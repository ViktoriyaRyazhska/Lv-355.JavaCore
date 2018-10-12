
public class Person2 {

	public static void main(String[] args) {

		Person per = new Person();
		per.setName("Ihor");
		per.setBurthYear(1989);
		System.out.println(per.toString() + " Age: " + per.calCAge());

		Person per1 = new Person("Anna", 1988);
		System.out.println(per1.toString() + " Age: " + per1.calCAge());

		Person per2 = new Person("Katja", 1995);
		System.out.println(per2.toString() + " Age: " + per2.calCAge());

		Person per3 = new Person();
		per3.setName("Taras");
		per3.setBurthYear(1977);
		System.out.println(per3.toString() + " Age: " + per3.calCAge());

		Person per4 = new Person("Dmytro", 1990);
		System.out.println(per4.toString() + " Age: " + per4.calCAge());
	}

}

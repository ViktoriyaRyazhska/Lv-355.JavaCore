package Classwork;

public class MainPersonAppl {

	public static void main(String[] args) {
		Person[] person = new Person[3];
		person[0] = new Student();
		person[1] = new Teacher();
		person[2] = new Cleaner();
		person[0].print();
		person[1].print();
		person[2].print();
				((Staff) person[1]).salary();
				((Staff) person[2]).salary();
				
	}

}

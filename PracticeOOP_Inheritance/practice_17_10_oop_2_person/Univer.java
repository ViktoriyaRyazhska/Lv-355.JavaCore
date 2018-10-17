package practice_17_10_oop_2_person;

public class Univer {

	public static void main(String[] args) {
		Person [] person = new Person [7];
		person[0]= new Student();
		person[1]= new Teacher();
		person[2]= new Cleaner();
		person[3]= new Cleaner();
		person[4]= new Teacher();
		person[5]= new Student();
		person[6]= new Student();
		for (int i=0; i<person.length; i++) {
			System.out.print(i+" ");
		person[i].print();
		if (person[i] instanceof Stuff) {
			((Stuff)person[i]).salary();
		
		}
		}

	}

}

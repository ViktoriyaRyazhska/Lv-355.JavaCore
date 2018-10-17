package practice_17_10_oop_2_person;

public class Student extends Person {
	final private String TYPE_PERSON="Student";

	@Override
	void print() {
		System.out.println("I am "+ TYPE_PERSON);		
	}
 
	

}

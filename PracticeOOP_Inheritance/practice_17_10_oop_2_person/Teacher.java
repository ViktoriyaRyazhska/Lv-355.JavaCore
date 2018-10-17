package practice_17_10_oop_2_person;

public class Teacher extends Stuff{
	final private String TYPE_PERSON="Teacher";

	@Override
	void salary() {
		// TODO Auto-generated method stub
		System.out.println("I have salary of teacher, but I want more");
		
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("I am "+ TYPE_PERSON);
	}
	

}

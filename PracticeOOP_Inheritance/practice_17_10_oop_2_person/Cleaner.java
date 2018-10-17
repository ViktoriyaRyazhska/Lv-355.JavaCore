package practice_17_10_oop_2_person;

public class Cleaner extends Stuff{
	final private String TYPE_PERSON = "Cleaner";

	@Override
	void salary() {
		System.out.println("I have salary of cleaner. It's enough");
		
	}

	@Override
	void print() {
		System.out.println("I am " + TYPE_PERSON);
		
	}
	

}

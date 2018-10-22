package Classwork;

public class AnimalAppl {

	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Cat();
		animal[1] = new Dog();
		animal[2] = new Cat();
		
		animal[0].feed();
		animal[0].voice();
		animal[1].feed();
		animal[1].voice();
		animal[2].feed();
		animal[2].voice();
		
	}

}

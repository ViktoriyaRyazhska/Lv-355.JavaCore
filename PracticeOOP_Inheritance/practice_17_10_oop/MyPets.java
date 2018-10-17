package practice_17_10_oop;


public class MyPets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] pet = new Animal[3];
		pet[0] = new Cat();
		pet[1] = new Dog();
		pet[2] = new Cat();

		for (int i = 0; i < pet.length; i++) {
			pet[i].voice();
			pet[i].feed();
			System.out.println("=======");

		}

	}
}

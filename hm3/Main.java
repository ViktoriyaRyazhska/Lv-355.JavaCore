package hm3;

public class Main {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.setName("name1");
		dog1.setBreed(Breed.LapDog);
		dog1.setAge(3);

		Dog dog2 = new Dog();
		dog2.setName("name2");
		dog2.setBreed(Breed.Spaniel);
		dog2.setAge(1);

		Dog dog3 = new Dog();
		dog3.setName("name1");
		dog3.setBreed(Breed.Shepherd);
		dog3.setAge(8);

		if ((dog1.getName().equals(dog2.getName())) || (dog1.getName().equals(dog3.getName()))
				|| (dog2.getName().equals(dog3.getName()))) {
			System.out.println("Error: two dogs cannot have a similar name.");
		}
		if ((dog1.getAge() > dog2.getAge()) && (dog1.getAge() > dog3.getAge())) {
			System.out.println(dog1);
		} else if ((dog2.getAge() > dog1.getAge()) && (dog2.getAge() > dog1.getAge())) {
			System.out.println(dog2);
		} else {
			System.out.println(dog3);
		}
	}

}

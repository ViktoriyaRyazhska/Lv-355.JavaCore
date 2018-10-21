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
		dog3.setName("name3");
		dog3.setBreed(Breed.Shepherd);
		dog3.setAge(8);
	
	System.out.println(nameMethod(dog1, dog2, dog3));
	System.out.println(ageMethod(dog1, dog2, dog3));
	
	}
public static String nameMethod(Dog dog1, Dog dog2, Dog dog3) {

	if ((dog1.getName().equals(dog2.getName())) || (dog1.getName().equals(dog3.getName()))|| (dog2.getName().equals(dog3.getName()))) {
		return "Some dogs have a similar names";
	}
	return "All dogs have different names";
	}

public static int ageMethod(Dog dog1, Dog dog2, Dog dog3) {
	int age;

	if ((dog1.getAge() > dog2.getAge()) && (dog1.getAge() > dog3.getAge())) {
		age = dog1.getAge();
		System.out.println(dog1);
	} else if ((dog2.getAge() > dog1.getAge()) && (dog2.getAge() > dog1.getAge())) {
		System.out.println(dog2);
		age = dog2.getAge();
	} else {
		System.out.println(dog3);
		age=dog3.getAge();
	}
	return age;
}
}

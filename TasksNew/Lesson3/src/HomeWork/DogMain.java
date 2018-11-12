package HomeWork;

public class DogMain {

	public static void main(String[] args) {
		Dog dog1 = new Dog(9, "Rex", Breed.AFGHANHOUND);
		Dog dog2 = new Dog(9, "Rex", Breed.AFGHANHOUND);
		Dog dog3 = new Dog(7, "Cat", Breed.SPITZ);
System.out.println(dog1.equals(dog2));
if (dog1.name.equals("Rex")) {
	System.out.println("First and second dogs have the same name");
	}
if (dog1.name.equals("cat")){
	System.out.println("First and third dogs have the same name");
}
if (dog2.name.equals("Cat")) {
	System.out.println("Second and third dogs have the same name");
}


if (dog1.getAge() > dog2.getAge() && dog1.getAge()> dog3.getAge()) {
	System.out.println(dog1);
	}
if (dog2.getAge()>dog1.getAge() && dog2.getAge()>dog3.getAge()){
	System.out.println(dog2);
}
if (dog3.getAge()>dog1.getAge() && dog3.getAge() > dog2.getAge()) {
	System.out.println(dog3);
}
	}

}


public class Dog {
	private String name;
	private Breeds breed;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Breeds getBreed() {
		return breed;
	}

	public void setBreed(Breeds breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dog() {

	}

	public Dog(String name, Breeds breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String toString() {
		return "Breed:" + " " + breed + "." + " " + "Name:" + " " + name + "." + " " + "Age" + " " + age;
	}

	public static void main(String args[]) {
		Dog dog1 = new Dog();
		dog1.setName("Ronny");
		dog1.setAge(5);
		dog1.setBreed(Breeds.Beagle);
		Dog dog2 = new Dog();
		dog2.setName("Rex");
		dog2.setAge(8);
		dog2.setBreed(Breeds.Bulldog);
		Dog dog3 = new Dog();
		dog3.setName("Hatiko");
		dog3.setAge(7);
		dog3.setBreed(Breeds.Labrador);
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);

		if (dog1.getName() == dog2.getName() || dog1.getName() == dog3.getName() || dog2.getName() == dog3.getName()) {
			System.out.println("The same names are here!");
		}
		if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
			System.out.println("The oldest dog is " + " " + dog1.getName()+" "+dog1.getBreed());
		} else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
			System.out.println("The oldest dog is" + " " + dog2.getName()+" "+dog2.getBreed());
		} else {
			System.out.println("The oldest dog is" + " " + dog3.getName()+" "+dog3.getBreed());
		}
	}
}

package HomeWork3;


public class Dog {
	
	private String name;
	private breed breed1;
	private int age;
	
	
	
	public Dog(String name, breed breed1, int age) {
		this.name = name;
		this.breed1 = breed1;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public breed getBreed() {
		return breed1;
	}
	public void setBreed(breed breed1) {
		this.breed1 = breed1;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Dog: "+ getName() + ", breed: "+ getBreed()+" years:" + getAge();
	}


}


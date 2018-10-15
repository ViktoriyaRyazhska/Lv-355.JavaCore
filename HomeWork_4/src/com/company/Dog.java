package com.company;

public class Dog {
	private String name;
	private int age;
	private Breed breed;
	public Dog(String name, int age, Breed breed){
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	public Dog() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void nameDog(Dog d1, Dog d2, Dog d3) {
		Dog[] mas = {d1, d2, d3};
		boolean y = false;
		for(int i = 0; i < 3; i++) {			//перевірка собак на одне ім'я
			String newName = mas[i].getName();
			for(int j=(i+1); j < 3;j++) {
				if(newName.equals(mas[j].getName())) {
					y = true;
					System.out.println("dog#"+ (i+1)+ "--" + newName + " == " + mas[j].getName() + " -- dog#" + (j+1));
				}
			}
		}
		if(y == false)
			System.out.println("Noone with the same name");
		
		int oldest = mas[0].getAge();  //найстаріша собака
		for(int i = 1; i < 3; i++) {
			if(mas[i].getAge() > oldest)
				oldest = mas[i].getAge();
		}
		for(int i = 0; i < 3; i++) {
			if(oldest == mas[i].getAge())
				System.out.println("The oldest dog: " + mas[i].getName() + " " + mas[i].getBreed());
		}
		
	}
	public Breed getBreed() {
		return breed;
	}
	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	
}
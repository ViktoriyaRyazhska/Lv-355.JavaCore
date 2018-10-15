package com.company;

public class Task2 {

	public static void main(String[] args) {
		
		Dog d1 = new Dog("Alis", 5, Breed.valueOf("Labrador"));
		Dog d2 = new Dog("Taras", 8, Breed.valueOf("Doberman"));
		Dog d3 = new Dog("Kivi", 6, Breed.valueOf("Boston_Terrier"));
		
		Dog.nameDog(d1, d2, d3);
	}

}
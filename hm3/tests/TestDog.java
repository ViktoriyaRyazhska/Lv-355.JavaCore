package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import hm3.Breed;
import hm3.Dog;
import hm3.Main;

public class TestDog {

	@Test
	public void testNameMethod() {
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
		assertTrue(Main.nameMethod(dog1, dog2, dog3)=="All dogs have different names");
	}

	@Test
	public void testAgeMethod() {
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
		assertTrue(Main.ageMethod(dog1, dog2, dog3)==8);
	
	}

}

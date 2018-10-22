package HomeWork;

import java.util.Objects;



public class Dog {
int age;
String name;
Breed breed;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Breed getBreed() {
	return breed;
}
public void setBreed(Breed breed) {
	this.breed = breed;
}
public Dog(int age, String name, Breed breed) {
	this.age = age;
	this.name = name;
	this.breed = breed;
}
public Dog(int age, String name) {
		this.age = age;
	this.name = name;
}
public Dog() {
	
}
@Override
public boolean equals(Object obj) {
	if (this == obj) 
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Dog other = (Dog) obj;
	return age == other.age &&
            Objects.equals(name, other.name) &&
            breed == other.breed;
}
@Override
public String toString() {
	return name + " "+ age + " " + breed;
}
}

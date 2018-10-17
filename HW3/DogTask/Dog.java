package DogTask;

import java.util.Objects;

public class Dog {
 String name;
 int age;
 Breed breed;

public Dog(String name) {
	this.name = name;
	
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
public Dog() {
}
public Breed getBreed() {
    return breed;
}

public void setBreed(Breed breed) {
    this.breed = breed;
}

	
public Dog (String name, int age, Breed breed) {
	this.name = name;
	this.age = age;
}
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

}


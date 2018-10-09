package hm2;

import java.io.BufferedReader;
import java.io.IOException;

public class Person{
	
	private String name;
	private int birthYear;
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public Person(String name) {
		this.name = name;
	}
	public Person() {
	}
	public int age() {
		return 2018-birthYear;
	}
	
	public void info (BufferedReader br) throws IOException {
	System.out.println("Input name");
	this.name = br.readLine();
	System.out.println("Input your birthday year");
	this.birthYear = Integer.parseInt(br.readLine());;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int birthYear() {
		return this.birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear=birthYear;
	}
	
	@Override

	public String toString() {

	return "Person [name=" + name + ", age=" + age() + "]";

	}
}
package Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Person {
	private String name;
	private int birthYear;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int age) {
		this.birthYear = birthYear;
	}

	public Person(String name, int age) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public Person() {

	}

	public int age() {
		return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
	}

	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String entredName = br.readLine();
		setName(entredName);
		System.out.println("Enter a year");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		this.birthYear = Integer.parseInt(br1.readLine());

	}

	public String output() {
		return "Name: " + getName() + " Age: " + age();
	}

	public void changeName() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter new name");
		String newName = br.readLine();
		setName(newName);
	}
}
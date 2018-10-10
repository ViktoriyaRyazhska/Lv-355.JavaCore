package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	private String name;
	private int year = 0;
	
	public Person(String name, int year) {
		this.name = name;
		this.year = year;
	}
	public Person() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public int age() {
		return 2018 - getYear();
	}
	public void input() throws IOException {
		System.out.print("Name: ");
		this.name = br.readLine();
		System.out.print("Year: ");
		this.year = Integer.parseInt(br.readLine()); 
	}
	/*@Override
	public String toString() {
		return "Name: " + getName() +  " ,Year: " + getYear() + " ,Age: " + age();
	}*/
	public void changeName() throws IOException {
		System.out.print("Write new name: ");
		this.name = br.readLine();
	}
	public void output() {
		System.out.println("Name: " + getName() +  " ,Year: " + getYear() + " ,Age: " + age());
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
public void setBirthYear(int birthYear) {
	this.birthYear = birthYear;
}
public Person() {
	
}
public Person(String name, int birthYear) {
	this.name = name;
	this.birthYear = birthYear;
}
public  int age(){
 int a = 2018-birthYear;
return a;
}
public void input(BufferedReader reader2) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter name");
	String s = reader.readLine();
	this.name = s;
	System.out.println("Enter year");
	int a = Integer.parseInt(reader.readLine());
	this.birthYear = a;
	
}
public int birthYear() {
	return this.birthYear;
}

public String toString(){
	return " Ім'я"+" "+name+"."+" "+"Рік народження"+" "+birthYear+".";
	
}
}

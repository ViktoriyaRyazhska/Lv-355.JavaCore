
public class Details {
private String name;
private int birthYear;
private int currentYear = 2018;
public Details (String name, int birthYear) {
	this.name = name;
	this.birthYear = birthYear;
	}
public Details() {
}
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
public int age() {
	int age = currentYear - birthYear;
	return age;	
}
public void output(){
	System.out.println("Name is: " + name, "age is: " + age);
}
}

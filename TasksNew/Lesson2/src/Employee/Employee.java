package Employee;

public class Employee {
private String name;
private int rate;
private int hours;
private static int totalSum;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRate() {
	return rate;
}
public void changeRate(int rate) {
	this.rate = rate;
}
public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
}
public Employee(String name, int rate, int hours) {
	super();
	this.name = name;
	this.rate = rate;
	this.hours = hours;
}
public Employee(String name, int rate) {
	super();
	this.name = name;
	this.rate = rate;
}
public Employee() {
	
}
public int salary() {
	return rate * hours;
}
public double bonuses() {
	return ((double)this.salary() * 0.1) + salary();
	
}
@Override
public String toString() {
	return "Employee name: " + name + "Employee rate: " + rate + "Employee salary: " + salary();
}

}


public class Employee {
	static double totalSum = 0;
private String name;
private int rate;
private int hours;
public void setName(String name) {
	this.name = name;
	}
public String getName() {
	return name;
}

public void setRate(int rate) {
	this.rate = rate;
}
	
public int getRate() {
	return rate;
}


public void setHours(int hours) {
	this.hours = hours;
}

public int getHours() {
	return hours;
}


public Employee (String name, int rate, int hours) {
	this.name = name;
	this.rate = rate;
	this.hours = hours;
}
public Employee (String name, int rate) {
	this.name = name;
	this.rate = rate;
}
Employee () {
	
}
public int Salary() {
	int salary = rate*hours;
	totalSum += salary;
	return salary;
}
public double Bonuses() {
	double bonuses = 1.1*Salary();
	totalSum += bonuses;
	return bonuses;
}
public double getTotalSum() {
	return totalSum;
} 
@Override
public String toString() {
	return "Employees salary is: ";
}

}



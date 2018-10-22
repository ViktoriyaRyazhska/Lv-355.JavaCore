package Homework;

public class Month {
int days;
String name;
public Month(int days) {
	this.days = days;
}
public Month (int days, String name) {
	this.days = days;
	this.name = name;
}
public Month() {
	
}

public int getDays() {
	return days;
}
public void setDays(int days) {
	this.days = days;
}
@Override
public String toString() {
	
	return name + " has " + days + " days" ;
}

}

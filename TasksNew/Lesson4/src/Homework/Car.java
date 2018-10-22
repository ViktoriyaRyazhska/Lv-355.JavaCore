package Homework;

public class Car {
private String type;
private int yearOfProduction;
private double engineCapacity;
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getYearOfProduction() {
	return yearOfProduction;
}
public void setYearOfProduction(int yearOfProduction) {
	this.yearOfProduction = yearOfProduction;
}
public double getEngineCapacity() {
	return engineCapacity;
}
public void setEngineCapacity(int engineCapacity) {
	this.engineCapacity = engineCapacity;
}
@Override
public String toString() {
	
	return "Car type: " + type + " Car year of production: " + yearOfProduction + " Engine Capacity: " + engineCapacity;
}
public Car(String type, int yearOfProduction, double d) {
	
	this.type = type;
	this.yearOfProduction = yearOfProduction;
	this.engineCapacity = d;
}
public Car(String type, int yearOfProduction) {
	
	this.type = type;
	this.yearOfProduction = yearOfProduction;
}
public Car(String type) {
	
	this.type = type;
}
public Car() {
	
}

}

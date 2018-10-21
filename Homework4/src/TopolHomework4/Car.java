package TopolHomework4;

public class Car {
	public Car(String type, int yearOfProduction, double engineCapacity) {
		
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
	}
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
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	@Override
	public String toString() {
		return "Car [type=" + type + ", yearOfProduction=" + yearOfProduction + ", engineCapacity=" + engineCapacity
				+ "]";
	}
	
	
	
	

}

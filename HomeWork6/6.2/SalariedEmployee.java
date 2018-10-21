
public class SalariedEmployee extends Employee  implements Inta {
	private String name;
	private int hourlyRate;
	private int numberOfHoursWorked;
	private String  employeeId;
	public SalariedEmployee(){
		
	}
	public SalariedEmployee(String name,String employeeId, int hourlyRate,int numberOfHoursWorked) {
		this.name = name;
		this.employeeId = employeeId;
		this.numberOfHoursWorked = numberOfHoursWorked;
		this.hourlyRate =hourlyRate; 
	}

public int calculatePay() {
	 return hourlyRate*numberOfHoursWorked;
}
public String toString() {
	return  "Name:"+" "+name +"."+" "+"ID"+" "+employeeId;
	
}
}

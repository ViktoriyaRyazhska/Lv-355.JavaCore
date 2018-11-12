package homeWork5_Task2_Topolev;

public abstract class Employee {

	private String name;
	private String employeeId;
	private double averageMonthlySalary;
	
	public Employee(String name, String employeeId) {
		
		this.name = name;
		this.employeeId = employeeId;
	}

	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public double getAverageMonthlySalary() {
		return averageMonthlySalary;
	}

	public void setAverageMonthlySalary(double averageMonthlySalary) {
		this.averageMonthlySalary = averageMonthlySalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

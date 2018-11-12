package homeWork5_Task2_Topolev;

public class ContractEmployee extends Employee implements Calc {

	private double hourlyRate;
	private double numberHoursWorked;
	private String socialSecurityNumber;
	private double averageMonthlySalary;

	public ContractEmployee(String name, String employeeId, double hourlyRate, double numberHoursWorked) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
		this.numberHoursWorked = numberHoursWorked;
		calculatePay();
	}

	@Override
	public void calculatePay() {
		setAverageMonthlySalary(hourlyRate * numberHoursWorked);

	}

	public double getGetAverageMonthlySalary() {
		return averageMonthlySalary;
	}

	public void setAverageMonhlySalary(double averageMonthlySalary) {
		this.averageMonthlySalary = averageMonthlySalary;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "ContractEmployee [ getEmployeeId()=" + getEmployeeId() + ", getAverageMonthlySalary()="
				+ getAverageMonthlySalary() + ", getName()=" + getName() + "]";
	}

}

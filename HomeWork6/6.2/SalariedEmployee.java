
public class SalariedEmployee extends Employee implements InFa {
	private int hourlyrate;
	private int numberofHoursWorked;
	private String socialSecurityNumber;

	public SalariedEmployee() {
	}

	public SalariedEmployee(int hourlyrate, int numberofHoursWorked, String socialSecurityNumber) {
		this.hourlyrate = hourlyrate;
		this.numberofHoursWorked = numberofHoursWorked;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public int calculatePay() {
		return hourlyrate * numberofHoursWorked;
	}

	public String toString() {
		return "Social security number" + " " + socialSecurityNumber;
	}

}

package HomeWork6;

public class SalariedEmployee extends Employee implements Inter {

	String socialSecurityNumber;
	int hours;
	int hr;

	public SalariedEmployee(String employeeld, String socialSecurityNumber, int hours, int hr) {
		super(employeeld);
		this.hours = hours;
		this.hr = hr;
		this.socialSecurityNumber = socialSecurityNumber;

	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [Name " + employeeld + ", socialSecurityNumber= " + socialSecurityNumber
				+ ", number of hours worked= " + hours + ", hourly rate= " + hr + ", salary= " + calculatePay() + "]";
	}

	@Override
	public int calculatePay() {
		return getHr() * getHours();

	}
}

package hm5;

public class SalariedEmployee extends Employee {
	
	int socialSecurityNumber;
	int salary;
	
	public int getSalary() {
		return salary;
	}

	public SalariedEmployee(String name, int empoyeeId, int socialSecurityNumber, int salary) {
		super(name, empoyeeId);
		this.socialSecurityNumber = socialSecurityNumber;
		this.salary = salary;
	}

	@Override
	public int calculatePay() {
		return salary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [name = " + name + ",  empoyeeId = " + empoyeeId + ",  socialSecurityNumber = " + socialSecurityNumber + ",  salary = " + salary + "]";
	}
	
}

package hm5;

public class ContractEmployee extends Employee {

	int federalTaxIdmember;
	int hourlyRate;
	int hoursWorked;

	public int getSalary() {
		return hourlyRate * hoursWorked;
	}

	public ContractEmployee(String name, int empoyeeId, int federalTaxIdmember, int hourlyRate, int hoursWorked) {
		super(name, empoyeeId);
		this.federalTaxIdmember = federalTaxIdmember;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public int calculatePay() {
		return hourlyRate * hoursWorked;
	}

	@Override
	public String toString() {
		return "ContractEmployee [name = " + name + ",  empoyeeId = " + empoyeeId + ",  federalTaxIdmember = "
				+ federalTaxIdmember + ",  salary = " + getSalary() + "]";
	}

}

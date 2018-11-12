package homeWork5_Task2_Topolev;

public class SalariedEmployee extends Employee implements Calc {

	private double fixedMontlyPayment;
	private String federalTaxIdMember;

	public String getFederalTaxIdMember() {

		return federalTaxIdMember;
	}

	public void setFederalTaxIdMember(String federalTaxIdMember) {
		this.federalTaxIdMember = federalTaxIdMember;
	}

	public SalariedEmployee(String name, String employeeId, double fixedMontlyPayment) {
		super(name, employeeId);
		this.fixedMontlyPayment = fixedMontlyPayment;
		calculatePay();
	}

	public void fixedPaidWorkers() {

	}

	@Override
	public void calculatePay() {
		setAverageMonthlySalary(fixedMontlyPayment);
		

	}

	@Override
	public String toString() {
		return "SalariedEmployee [ getEmployeeId()=" + getEmployeeId() + ", getAverageMonthlySalary()="
				+ getAverageMonthlySalary() + ", getName()=" + getName() + "]";
	}

}

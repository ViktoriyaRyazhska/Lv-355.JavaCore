package HomeWork6;

public class ContractEmployee extends Employee implements Inter {
	String federalTaxIdmember;
	int pay;

	public ContractEmployee(String employeeld, String federalTaxIdmember, int pay) {
		super(employeeld);
		this.pay = pay;
		this.federalTaxIdmember = federalTaxIdmember;

	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "ContractEmployee [Name " + employeeld + ", federalTaxIdmember=" + federalTaxIdmember
				+ ", fixed monthly payment=" + pay + ", salary= " + calculatePay() + "]";
	}

	@Override
	public int calculatePay() {
		return getPay();

	}

}

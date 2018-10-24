
public class ContractEmployee extends Employee{
	
	protected int federalTaxIdmember = 0;
	protected double rate = 0;
	protected int hours = 0;
	
	public ContractEmployee(String id, int federalTaxIdmember, double rate, int hours) {
		super(id);
		this.federalTaxIdmember = federalTaxIdmember;
		this.rate = rate;
		this.hours = hours;
	}
	
	/*public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}*/
	
	@Override
	public double calculatePay() {
		return rate * hours;
	}

	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdmember=" + federalTaxIdmember + ", rate=" + rate + ", hours=" + hours
				+ ", emlployeeID=" + getEmlployeeID() + ", calculatePay()=" + calculatePay() + "]";
	}



}

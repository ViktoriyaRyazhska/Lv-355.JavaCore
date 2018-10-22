
public class ContractEmployee extends Employee {
	private int fixedMounthlyPayment;
	private boolean federalTaxIdMember;

	public ContractEmployee() {

	}

	public ContractEmployee(int fixedMounthlyPayment, boolean federalTaxIdMember) {
		this.fixedMounthlyPayment = fixedMounthlyPayment;
		this.federalTaxIdMember = federalTaxIdMember;

	}

	@Override
	public int calculatePay() {
		return fixedMounthlyPayment;
	}

	public String toString() {
		if (federalTaxIdMember) {
			System.out.println("Is person  federal tax Id member? " + federalTaxIdMember);
		} else {
			return ("Person can not work here, because you must have be federal tax id member!");

		}
		return "";
	}
}

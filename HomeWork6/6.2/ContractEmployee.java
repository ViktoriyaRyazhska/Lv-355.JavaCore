
public class ContractEmployee extends Employee implements InFa {
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
		if(federalTaxIdMember==false) {
			System.out.println("Person can not work here, because you must have be federal tax id member!");
		}
		else {
		return "Is person  federal tax Id member? " + federalTaxIdMember;
		}
		return "";
	}
	}


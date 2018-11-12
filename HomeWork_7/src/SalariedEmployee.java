import java.util.Scanner;

public class SalariedEmployee extends Employee{
	
	protected String socialSecurityNumber;
	protected double fixpaid = 0;
	
	public SalariedEmployee(String id, String socialSecurityNumber, double fixpaid) {
		super(id);
		this.socialSecurityNumber = socialSecurityNumber;
		this.fixpaid = fixpaid;
	}	
	public SalariedEmployee() {}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [socialSecurityNumber=" + socialSecurityNumber + ", fixpaid=" + fixpaid
				+ ", emlployeeID=" + getEmlployeeID() + ", calculatePay()=" + calculatePay() + "]";
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getFixpaid() {
		return fixpaid;
	}

	public void setFixpaid(double fixpaid) {
		this.fixpaid = fixpaid;
	}

	@Override
	public double calculatePay() {
		return fixpaid;
	}
	
	public void input(Scanner sc) {
		System.out.println("SalariedEmployee");
		System.out.print("Enter id: ");
		setEmlployeeID(sc.next());
		System.out.print("Enter socialSecurityNumber: ");
		setSocialSecurityNumber(sc.next());
		System.out.print("Enter fixpaid: ");
		setFixpaid(sc.nextDouble());
	}
	
}

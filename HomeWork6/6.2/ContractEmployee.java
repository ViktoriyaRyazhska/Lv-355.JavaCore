
public class ContractEmployee  extends Employee  implements Inta{
private int fixedMonthlyPayment;
private String name;
private String employeeId;
public ContractEmployee() {
	
}
public ContractEmployee(String name,String employeeId,int fixedMonthlyPayment) {
	this.name = name;
	this.employeeId = employeeId;
	this.fixedMonthlyPayment = fixedMonthlyPayment;
}
	@Override
	public int calculatePay() {
		return fixedMonthlyPayment;
	}
	public String toString() {
		return  "Name:"+" "+name +"."+" "+"ID"+" "+employeeId;
		
	}

}


public abstract class Employee implements calPay{
	private String emlployeeID;
	
	public String getEmlployeeID() {
		return emlployeeID;
	}

	public void setEmlployeeID(String emlployeeID) {
		this.emlployeeID = emlployeeID;
	}
	
	public Employee(String id) {
		this.emlployeeID = id;
	}
	
	public Employee() {}
	
}

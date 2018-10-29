package hm5;

public abstract class Employee implements Salary {
	protected String name;
	protected int empoyeeId;

	
	public Employee(String name, int empoyeeId) {
		this.name = name;
		this.empoyeeId = empoyeeId;
	}
	
	public int getEmpoyeeId() {
		return empoyeeId;
	}

	public void setEmpoyeeId(int empoyeeId) {
		this.empoyeeId = empoyeeId;
	}
	

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract int getSalary();
    
}

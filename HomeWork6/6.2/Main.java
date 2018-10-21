
public class Main {

	public static void main(String[] args) {
		SalariedEmployee[] emp = new SalariedEmployee[3];
		emp[0] = new SalariedEmployee("Andrii","5", 5, 70);
		emp[1] = new SalariedEmployee("Natalia","3", 10, 70);
		emp[2] = new SalariedEmployee("Yana","5", 8, 70);
		ContractEmployee[] c = new ContractEmployee[2];
		c[0] = new ContractEmployee("Ostap","4",8000);
		c[1] = new ContractEmployee("Liza","7",9000);
		SalariedEmployee a;
		ContractEmployee b;
		for(int i = 0;i<emp.length-1;i++) {
			for(int j = i+1;j<emp.length;j++) {
				if(emp[i].calculatePay()<emp[j].calculatePay()) {
					a = emp[i];
					emp[i] = emp[j];
					emp[j] = a;
				}
			}
		}
		for(int i = 0;i<emp.length;i++) {
			System.out.println(emp[i]);
			System.out.println("Salary"+" "+emp[i].calculatePay());
		}
	
	for(int i = 0;i<c.length-1;i++) {
		for(int j = i+1;j<c.length;j++) {
			if(c[i].calculatePay()<c[j].calculatePay()) {
				b = c[i];
				c[i] = c[j];
				c[j] = b;
			}
		}
	}
	for(int i = 0;i<c.length;i++) {
		System.out.println(c[i]);
		System.out.println("Salary"+" "+c[i].calculatePay());
	}
}

}

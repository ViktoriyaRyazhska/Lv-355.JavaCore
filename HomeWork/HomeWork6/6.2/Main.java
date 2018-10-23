
public class Main {

	public static void main(String[] args) {
		Employee[] g = { new SalariedEmployee(30, 54, "7"), new SalariedEmployee(53, 54, "32"),
				new ContractEmployee(6000, true), new ContractEmployee(4000, false) };
		g[0].setName("Andrii");
		g[0].setEmployeeId("3");
		g[1].setName("Nataly");
		g[1].setEmployeeId("6");
		g[2].setName("Lesia");
		g[2].setEmployeeId("7");
		g[3].setName("Rostik");
		g[3].setEmployeeId("9");

		Employee a;
		for (int i = 0; i < g.length - 1; i++) {
			for (int j = i + 1; j < g.length; j++) {
				if (g[i].calculatePay() < g[j].calculatePay()) {
					a = g[i];
					g[i] = g[j];
					g[j] = a;
				}
			}
		}
		int n = 1;
		for (int i = 0; i < g.length; i++) {
			System.out.println(n + ")" + " " + "Name: " + g[i].getName() + ",  " + "Employee id:" + g[i].getEmployeeId());
			System.out.println("Salary " + g[i].calculatePay());
			System.out.println(g[i]);
			n++;
		}
		

	}

}

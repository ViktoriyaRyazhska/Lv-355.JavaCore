package hm5;

public class ApplSalary {
	public static void main(String[] args) {

		Salary[] s = new Salary[4];

		s[0] = new SalariedEmployee("name1", 1, 11, 350);
		s[1] = new ContractEmployee("name2", 2, 32, 20, 20);
		s[2] = new SalariedEmployee("name3", 3, 23, 560);
		s[3] = new ContractEmployee("name4", 4, 44, 50, 10);

		for (int i = 0; i < s.length; i++) {
			s[i].calculatePay();
			System.out.println(s[i]);
		}

		for (int i = 0; i < s.length; i++) {

			Salary tmp;
			for (int f = 0; f < s.length - 1; f++) {
				s[f].calculatePay();
				for (int j = f + 1; j < s.length; j++) {
					s[j].calculatePay();
					if (((Employee)s[f]).getSalary() < ((Employee)s[j]).getSalary()) {
						tmp = s[f];
						s[f] = s[j];
						s[j] = tmp;
					}
				}
			}
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
}
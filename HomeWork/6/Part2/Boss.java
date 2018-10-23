package HomeWork6;

public class Boss {

	public static void main(String[] args) {
		Employee[] em = new Employee[4];
		em[0] = new SalariedEmployee("Dima", "224", 8, 10);
		em[1] = new SalariedEmployee("Taras", "3443", 12, 12);
		em[2] = new ContractEmployee("Katja", "123", 130);
		em[3] = new ContractEmployee("Sam", "234", 747);
		compare(em);
		for (int i = 0; i < em.length; i++) {
			System.out.println(em[i]);
		}
	}
		public static void compare (Employee [] p) {
			Employee per;
			
			for (int i = 0; i < p.length - 1; i++) {

				for (int j = i + 1; j < p.length; j++) {

					if (((Inter) p[i]).calculatePay() < ((Inter) p[j]).calculatePay()) {

						per = p[i];

						p[i] = p[j];

						p[j] = per;

					}

				}

			}
		}
	}

		
//			if (em[i] instanceof SalariedEmployee) {
//				System.out.println(((SalariedEmployee)em[i]).calculatePay());
//			}
		
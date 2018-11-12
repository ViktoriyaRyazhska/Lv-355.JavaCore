package homeWork5_Task2_Topolev;



public class HW5_Task2_Topolev_Main {

	public static void main(String[] args) {

		Employee[] empl = new Employee[6];
		double seq[] = new double[6];
		double tmp = 0;
		
		empl[0] = new SalariedEmployee("Ann", "14311", 21300);
		empl[1] = new SalariedEmployee("Peter", "43453", 18200);
		empl[2] = new ContractEmployee("Mark", "7370473", 100.0, 160.5);
		empl[3] = new SalariedEmployee("John", "743475", 24500);
		empl[4] = new ContractEmployee("Sofy", "22213", 80, 120.3);
		empl[5] = new ContractEmployee("Kim", "45322", 95.0, 180.5);

		for (int i = 0; i < empl.length; i++) {
			seq[i] = empl[i].getAverageMonthlySalary();
		}

		for (int i = 0; i < empl.length - 1; i++) {
			for (int j = i + 1; j < empl.length; j++) {

				if (seq[i] > seq[j]) {
					tmp = seq[i];
					seq[i] = seq[j];
					seq[j] = tmp;
				}
			}
		}
			
		
			for (int i = 0; i < seq.length; i++) {
				for (int j=0; j<empl.length; j++)
				if (seq[i] == empl[j].getAverageMonthlySalary()) {
					System.out.println(empl[j].toString());
					
				}
			}
		}
	}


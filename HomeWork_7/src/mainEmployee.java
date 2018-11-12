import java.util.Arrays;
import java.util.Scanner;

public class mainEmployee {
	
	
	public static void averagePay(Employee[] e) {
		Employee tmp;
		for (int i = 0; i < e.length - 1; i++) {
			for (int j = i + 1; j < e.length; j++) {
				if(e[i].calculatePay() < e[j].calculatePay()) {
					tmp = e[i];
					e[i] = e[j];
					e[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(e));

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new SalariedEmployee() ;
		((SalariedEmployee)e1).input(sc);
		
		Employee[] e = {new SalariedEmployee("45", "100", 2500), e1,
				new ContractEmployee("46", 101, 50, 40),
				new ContractEmployee("48", 102, 60, 50)
		}; 
		
		for (int i = 0; i < e.length; i++) {
			System.out.println(i + " " + e[i].calculatePay());
		}
		
		averagePay(e);
		
		
		
		sc.close();
	}

}

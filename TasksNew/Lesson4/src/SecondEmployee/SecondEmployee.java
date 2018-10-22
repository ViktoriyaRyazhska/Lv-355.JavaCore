package SecondEmployee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondEmployee {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int salary = 0;
		Employee[] employees = new Employee[5];
		employees[0] = new Employee("Ira", 2, 1450);
		employees[1] = new Employee("Ihor", 3, 1350);
		employees[2] = new Employee("Mykola", 4, 1500);
		employees[3] = new Employee("Tania", 4, 1800);
		employees[4] = new Employee("Karina", 5, 1400);
		
		for (int i = 0; i < employees.length; i++) {
		
			if (employees[salary].getSalary() < employees[i].getSalary()){
				salary = i;
			}
			System.out.println(employees[salary].toString());
		}
		
		System.out.println("Enter the number of department");
		int dep = Integer.parseInt(br.readLine());
		for (int i = 0; i < employees.length; i++) {
			if (dep == employees[i].getDepartmentNumber()) {
				System.out.println(employees[i]);
			}
		}
		
	
}
}


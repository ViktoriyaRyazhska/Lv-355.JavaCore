package MyLoop;

import java.util.Scanner;

public class Employee {
	private String name;
	private int deparmentName;
	private double salary;

	public Employee(String name, int deparmentName, double salary) {
		super();
		this.name = name;
		this.deparmentName = deparmentName;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeparmentName() {
		return deparmentName;
	}

	public void setDeparmentName(int deparmentName) {
		this.deparmentName = deparmentName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void findDepartment() {
	}
	
	@Override
	public String toString() {
		
		return "Employee: "+ getName() + " Department: "+ getDeparmentName()+ " Salary: " +getSalary();
	}

	static void departmentNumber(Employee[] employeeAr) {
		System.out.println("Enter department number:");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Department " + n + ": ");
		for (int i = 0; i < employeeAr.length; i++) {
			if (n == employeeAr[i].getDeparmentName()) {
				//System.out.println("Employee:" + employeeAr[i].getName());
				System.out.println(employeeAr[i].toString());

			}
			sc.close();
		}
	}
	public static void salarySort(Employee[] employeeAr) {
		// TODO Auto-generated method stub
		Employee temp;
		for (int i = 0; i < employeeAr.length; i++) {
			for (int j = i + 1; j < employeeAr.length; j++) {
				if (employeeAr[i].getSalary() < employeeAr[j].getSalary()) {
					temp = employeeAr[i];
					employeeAr[i] = employeeAr[j];
					employeeAr[j] = temp;
				}
			}
		}

		for (int i = 0; i < employeeAr.length; i++) {
			//System.out.println(employeeAr[i].getName() + " " + employeeAr[i].getSalary());
			System.out.println(employeeAr[i].toString());
		}

	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Employee {
	private String name;
	private int department;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {

	}

	public Employee(String name, int department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String toString() {
		return (name + " " + department + " " + salary);
	}

	public static void main(String[] args) throws IOException {
		Employee[] employee = { new Employee("Olia", 4, 1003), new Employee("Andrii", 6, 1002),
				new Employee("Yana", 5, 3000), new Employee("Bogdan", 7, 4000), new Employee("Arkadiy", 7, 400) };

		System.out.println(Arrays.asList(employee));
		Employee a = employee[0];
		int sal = 0;
		for (int i = 0; i < employee.length; i++) {
			if (employee[sal].getSalary() < employee[i].salary) {
				sal = i;
			}
		}
		System.out.println(employee[sal]);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of department");
		int dep = Integer.parseInt(reader.readLine());
		Employee n = employee[0];
		for (int i = 0; i < employee.length; i++) {
			if (dep == employee[i].getDepartment()) {
				System.out.println(employee[i]);
			}
		}
	}

}

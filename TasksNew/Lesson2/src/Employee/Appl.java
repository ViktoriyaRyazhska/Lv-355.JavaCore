package Employee;

public class Appl {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ivan", 32, 40);
		Employee e2 = new Employee("Petro", 16, 32);
		Employee e3 = new Employee("Vika", 40, 8);
		int totalSalary = e1.salary() + e2.salary() + e3.salary();
System.out.println(totalSalary);
	}

}

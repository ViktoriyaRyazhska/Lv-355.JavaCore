package SecondEmployee;
import java.io.BufferedReader;
import java.io.IOException;
public class Employee {
	String name;
	int departmentNumber;
	int salary;
	Employee (String name, int departmentNumber, int salary){
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}
	Employee (String name, int salary){
		
	}
	Employee(){
	}
	public void input(BufferedReader br) throws IOException {
		System.out.println("Ваше імя?");
		this.name = br.readLine();
		System.out.println("Ваш відділ?");
		this.departmentNumber = Integer.parseInt(br.readLine());
		System.out.println("Ваша зп?");
		this.salary = Integer.parseInt(br.readLine());
	
	
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {

return "Name is: " + name + " " + "Department number is: " + departmentNumber + " " + "Salary is: " + salary;
	}
	
	
}

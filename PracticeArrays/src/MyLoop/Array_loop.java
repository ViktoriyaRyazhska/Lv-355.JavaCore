package MyLoop;

public class Array_loop {

	public static void main(String[] args) {

		int[] myArray = {5, 4, 6, -8, 67, 44, 3, 33, 45, -10};
		
		Biggest m = new Biggest ();
		m.findBig(myArray);
		
		MySum s=new MySum();
		s.sum(myArray);
		
		AmountNeg aNeg=new AmountNeg();
		aNeg.amountNeg(myArray);
		
		int n;
		Employee[] employeeAr = new Employee[5];

		employeeAr[0] = new Employee("Mark", 3, 10000.50);
		employeeAr[1] = new Employee("Peter", 1, 12001.25);
		employeeAr[2] = new Employee("Ann", 1, 15400.45);
		employeeAr[3] = new Employee("Alex", 2, 12030.90);
		employeeAr[4] = new Employee("Victor", 2, 15000);
		System.out.println("\n Choose department: ");
		Employee.departmentNumber(employeeAr);
		System.out.println("\n Sorting employee by salary descending: ");
		Employee.salarySort (employeeAr);		
		
	
}
}
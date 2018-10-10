
public class Appl {

	public static void main(String[] args) {
		Employee w1 = new Employee();
		w1.setName("Kolia");
		w1.setRate(56);
		w1.setHours(15);
		w1.Salary();
		w1.Bonuses();
		Employee w2 = new Employee();
		w2.setName("Ivan");
		w2.setRate(13);
		w2.setHours(14);
		w2.â();
		w2.Bonuses();
		Employee w3 = new Employee();
		w3.setName("petro");
		w3.setRate(13);
		w3.setHours(32);
		w3.Bonuses();
		w3.Salary();

		System.out.println(Employee.totalSum);
	}

}

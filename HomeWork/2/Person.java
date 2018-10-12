import java.time.LocalDate;
import java.time.Period;

public class Person {

	private int burthYear;
	private String name;
	

	public Person(String name, int burthYear) {
		this.name = name;
		this.burthYear = burthYear;
		// age = 2018 - burthYear;
	}

	public Person() {
		// age = 2018 - burthYear;
	}

	public int getBurthYear() {
		return burthYear;
	}

	public void setBurthYear(int burthYear) {
		// age = 2018 + this.burthYear;
		this.burthYear = burthYear;
		// age = 2018 - burthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int calCAge() {
		return LocalDate.now().getYear() - burthYear;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Burth Year: " + burthYear;
	}

}

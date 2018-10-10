
public class Person {

	private int burthYear;
	private String name;
	private static int age;

	public Person(String name, int burthYear) {
		this.name = name;
		this.burthYear = burthYear;
		age = 2018 - burthYear;
	}

	public Person() {
		age = 2018 - burthYear;
	}

	public int getBurthYear() {
		return burthYear;
	}

	public void setBurthYear(int burthYear) {
		age = 2018 + this.burthYear;
		this.burthYear = burthYear;
		age = 2018 - burthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Burth Year: " + burthYear + " Age: " + age;
	}

	public void changeName(String oldName, String newName) {
		if (name.equalsIgnoreCase(oldName)) {
			System.out.println("Did not provide current account holder's name");
		} else {
			System.out.println("Invalid name");
		}

		if (!newName.equalsIgnoreCase(oldName)) {
			oldName.replaceAll(oldName, newName);
		}
	}
}

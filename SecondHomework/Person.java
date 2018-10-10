
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
	private String name;
	private int birthYear;
	Calendar c = new GregorianCalendar();
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int age() {
		return this.birthYear = c.get(Calendar.YEAR) - birthYear;
		  
	}

	public void input(BufferedReader br) throws IOException {

	System.out.println("Ваше імя?");
		this.name = br.readLine();
		System.out.println("Введіть рік народження");
		this.birthYear = Integer.parseInt(br.readLine());
		

	}
			
	@Override

	public String toString() {

	return "Імя: " + name + ", Вік:" + age();

}
}

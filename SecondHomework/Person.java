
import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;



public class Person {
	private String name;
	private int birthYear;
	LocalDate today = LocalDate.now();
	
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
		return this.birthYear = today.getYear() - birthYear;
				//Calendar.getInstance().get(Calendar.YEAR) - birthYear;
		  
	}
	
	public void input(BufferedReader br) throws IOException {

	System.out.println("���� ���?");
		this.name = br.readLine();
		System.out.println("������ �� ����������");
		this.birthYear = Integer.parseInt(br.readLine());
		

	}
			
	@Override

	public String toString() {

	return "���: " + name + ", ³�:" + age();

}
}

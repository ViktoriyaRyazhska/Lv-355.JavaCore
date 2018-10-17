import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {

	private String name;
	
	public Person () {}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	private int birthYear;
	
	
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
	
	public int myAge(int birthYear) {
		return (LocalDate.now().getYear()-birthYear);
	}
	public void  input () throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name: ");
		String inName = br.readLine();
		setName(inName);
		
		System.out.println("Enter year: ");
		setBirthYear (Integer.parseInt(br.readLine()));
	
	}
	 public String output() { 
		 return "Student: "+getName()+" was born in " + getBirthYear();
	 };
	
	 public void changeName () throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name: ");
		String inName = br.readLine();
		setName(inName);
	};
	
	
}

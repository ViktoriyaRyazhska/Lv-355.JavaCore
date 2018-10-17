
public class Student extends Person{
	private String TypePerson;
	
	public String getTypePerson() {
		return TypePerson;
	}
public Student() {
	
}
	public void setTypePerson(String typePerson) {
		TypePerson = typePerson;
	}
	public Student(String TypePerson) {
		System.out.println(this.TypePerson);
	}

	@Override
	public void print() {
		System.out.println("I am a student");
		
	}

}

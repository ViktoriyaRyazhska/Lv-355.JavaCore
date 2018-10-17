
public class Teacher extends Staff{
	private String TypePerson;
	
	public String getTypePerson() {
		return TypePerson;
	}
	public void setTypePerson(String typePerson) {
		TypePerson = typePerson;
	}
	public Teacher(String TypePerson) {
		System.out.println(this.TypePerson);
	}
	public Teacher() {
		
	}
	@Override
	public void print() {
		System.out.println("I am a teacher");
		
	}
	@Override
	public void salary() {
		System.out.println(7000);
		
	}

}

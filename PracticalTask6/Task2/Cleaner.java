
public class Cleaner extends Staff{
	private String TypePerson;
	
	public String getTypePerson() {
		return TypePerson;
	}
	public void setTypePerson(String typePerson) {
		TypePerson = typePerson;
	}
	public Cleaner(String TypePerson) {
		System.out.println(this.TypePerson);
	}
	public Cleaner() {
		
	}
	@Override
	public void print() {
		System.out.println("I am a cleaner");
		
	}
	@Override
	public void salary() {
		System.out.println(3500);
		
	}

}

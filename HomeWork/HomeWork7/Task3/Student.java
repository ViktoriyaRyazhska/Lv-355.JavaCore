import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	private int course;
	private String name;

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {

	}

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
		
	}
	public void printStudents(List<Student> students) {
		for(Student b:students)
			System.out.println(b);
	
	}
	public String toString() {
		return name+" "+course;
	}
	
}

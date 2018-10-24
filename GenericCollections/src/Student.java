import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private int course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
	public Student() {}
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	
	public static List<Student> sortByName(List<Student> student) {
		
		Collections.sort(student, new Comparator<Student>(){
			public int compare(Student s1, Student s2) {
				return String.valueOf(s1.getName()).compareTo(s2.getName());
			}
		});
		
		return student;
	}
	
	public static List<Student> sortByCourse(List<Student> student){
		
		Collections.sort(student, new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				return Integer.valueOf(s1.getCourse()).compareTo(s2.getCourse());
			}
		});
		
		return student;
	}
	
	public static void printStudent(List<Student> student, int course) {
		for (Iterator<Student> iterator = student.iterator(); iterator.hasNext();) {
			Student st = (Student) iterator.next();
			if(st.getCourse() == course) {
				System.out.println(st);
			}
			
		}
	}
}

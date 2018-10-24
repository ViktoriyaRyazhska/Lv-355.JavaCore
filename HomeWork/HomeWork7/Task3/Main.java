import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List <Student> students  = new ArrayList<Student>();
		students.add(new Student("Emma",4));
		students.add(new Student("Arni",6));
		students.add(new Student("Anna",2));
		students.add(new Student("Masha",1));
		students.add(new Student("Alina",2));
	Student v = new Student();
	v.printStudents(students);
	System.out.println("Sorted by name");
	students.sort(new NameComparator());
	
	for(Student s:students) {
		System.out.println(s);
	}
	System.out.println("Sorted by course");
	students.sort(new CourseComparator());
	for(Student s:students) {
		System.out.println(s);
	}
	}

}

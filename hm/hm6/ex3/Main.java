package hm6;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add (new Student("name1", 1));
		students.add (new Student("name5", 3));
		students.add (new Student("name2", 2));
		students.add (new Student("name4", 1));
		students.add (new Student("name3", 3));
		System.out.println(students);
	
		Student.printStudents(students, 3);
		
		students.sort(new NameComparator());
		System.out.println(students);
	
		students.sort(new CourseComparator());
		System.out.println(students);
	
	}
}

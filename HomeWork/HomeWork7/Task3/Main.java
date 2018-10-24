import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Emma", 4));
		students.add(new Student("Arni", 6));
		students.add(new Student("Anna", 2));
		students.add(new Student("Masha", 1));
		students.add(new Student("Alina", 2));
		Student v = new Student();
		v.printStudents(students);
		System.out.println("Sorted by name");
		students.sort(new NameComparator());

		for (Student s : students) {
			System.out.println(s);
		}
		System.out.println("Sorted by course");
		students.sort(new CourseComparator());
		for (Student s : students) {
			System.out.println(s);
		}
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		String name = reader.readLine();
		for (Student s : students) {
			if (s.getName().equals(name)) {
				System.out.println(s);
			}
		}
		System.out.println("Enter course");
		int course = Integer.parseInt(reader.readLine());
		for (Student s : students) {
			if (s.getCourse() == course) {
				System.out.println(s);
			}
		}

	}

}
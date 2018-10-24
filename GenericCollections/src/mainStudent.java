import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainStudent {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<Student>();
		
		Student s1 = new Student("Marta", 101);
		Student s2 = new Student("Valentyn", 101);
		Student s3 = new Student("Petya", 103);
		Student s4 = new Student("Alex", 104);
		Student s5 = new Student("Max", 105);
		
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		student.add(s5);
		
		System.out.println(student);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of a course: ");
		int course = sc.nextInt();
		sc.close();
		Student.printStudent(student, course);
		System.out.println("By name: " + Student.sortByName(student));
		System.out.println("By course: " + Student.sortByCourse(student));
	}

}

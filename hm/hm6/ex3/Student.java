package hm6;

import java.util.List;

public class Student {
	String name;
	int course;

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

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

	public static void printStudents(List<Student> students, Integer course) {
		  for (int i = 0; i < students.size(); i++) {
	            if (course == students.get(i).getCourse()) {
	                System.out.println(students.get(i).getName());
	            }
	        }
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
}

package ClassTasks;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Ivan", 5);
		Student student2 = new Student("Petro", 3);
		Student student3 = new Student("Khrystyna", 1);
		System.out.println("Average rating is: " + Student.getAvgRating());
System.out.println(student1);
System.out.println(student2);
System.out.println(student3);
System.out.println(student1.betterStudent(student2));
	}

}

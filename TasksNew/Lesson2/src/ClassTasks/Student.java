package ClassTasks;

public class Student {
private String name;
private static  int raiting;
private  static int sum = 0;
private static  int count = 0;
public Student(){
	count++;
}
public Student(String name, int raiting) {
	this.name = name;
	this.raiting = raiting;
	count++;
	sum = sum + raiting;
	}
public Student (String name) {
	count++;
}

@Override
public String toString() {
	return "Student name: " + name + " Student raiting: " + raiting;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static int getRaiting() {
	return raiting;
}
public void setRaiting(int raiting) {
	sum = sum - this.raiting;
	this.raiting = raiting;
	sum = sum + raiting;
}
public static double getAvgRating () {
	return ((double)sum)/count;
}
public boolean betterStudent (Student student) {
	return this.raiting > Student.getRaiting();
}
}

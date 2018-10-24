import java.util.Comparator;

public class CourseComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getCourse()-s2.getCourse();
	}

}

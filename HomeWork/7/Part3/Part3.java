package HomeWork7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Part3 {

	private String name;
	private int course;

	public Part3(String name, int course) {
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

	@Override
	public String toString() {
		return "Sudents name= " + name + ", course=" + course + "";
	}

	public static void printStudents(List<Part3> st) {

		Iterator<Part3> itr = st.iterator();
		while (itr.hasNext()) {
			System.out.println((Part3) itr.next());
		}

	}

	public static void main(String[] args) {

		List<Part3> st = new ArrayList<Part3>();
		st.add(new Part3("Dmytro", 3));
		st.add(new Part3("Ira", 2));
		st.add(new Part3("Andriy", 5));
		st.add(new Part3("Katja", 1));
		st.add(new Part3("Orusja", 4));

		st.sort (new NameComparator());
		for(Part3 name : st) {
			System.out.println(name);
		}
		System.out.println("");
		st.sort (new Couserscomparator());
		for(Part3 courses : st) {
			System.out.println(courses);
		}
		
		
		
		//printStudents(st);

	}

}

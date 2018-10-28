package HomeWork7;

import java.util.Comparator;

public class Couserscomparator implements Comparator <Part3> {

	@Override
	public int compare(Part3 o1, Part3 o2) {
		return o1.getCourse() - o2.getCourse();
	}

}

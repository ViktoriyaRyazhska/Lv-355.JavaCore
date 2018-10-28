package HomeWork7;

import java.util.Comparator;

public class NameComparator implements Comparator <Part3> {

	@Override
	public int compare(Part3 o1, Part3 o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

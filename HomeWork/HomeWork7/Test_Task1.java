import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class Test_Task1 {
	Set<Integer> set1 = new HashSet<Integer>();
	Set<Integer> set2 = new HashSet<Integer>();

	@Test
	public void testIntersect() {
		Set<Integer> set3 = new HashSet<Integer>();
		set3.add(3);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		assertTrue(Task1.intersect(set1, set2).equals(set3));
	}

	@Test
	public void testUnion() {
		Set<Integer> set3 = new HashSet<Integer>();
		set3.addAll(set1);
		set3.addAll(set2);
		assertTrue(Task1.union(set1, set2).equals(set3));
	}

}

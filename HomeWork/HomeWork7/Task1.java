import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		Random rand;
		for (int i = 0; i < 10; i++) {
			rand = new Random();
			set1.add(rand.nextInt(20));
			set2.add(rand.nextInt(20));
		}
		Iterator<Integer> iterator = set1.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		Iterator<Integer> iterator2 = set2.iterator();
		System.out.println();
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}
		System.out.println();
		union(set1, set2);
		intersect(set1, set2);
	}

	public static Set intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> set3 = new HashSet<>();
		for (Integer t : set1) {
			for (Integer t2 : set2) {
				if (t.equals(t2)) {
				set3.add(t);
				}
			}
		}
		System.out.println();
		System.out.println("Intersected elements");
				for (Integer r : set3) {
			System.out.print(r+" ");
			}
				return set3;
		
	}

	public static Set union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> set4 = new HashSet<>();
		set4.addAll(set1);
		set4.addAll(set2);
		System.out.println("United elements: ");
		for (Integer a : set4) {
			System.out.print(a + " ");
		}
		return set4;
	}
}

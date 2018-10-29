package hm6;

import java.util.HashSet;
import java.util.Set;

public class ex1 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int i = 0; i < 5; i++) {
			set1.add((int) (Math.random() * 10));
			set2.add((int) (Math.random() * 10));
		}
		System.out.println("Set 1:" + set1);
		System.out.println("Set 2:" + set2);
		Union(set1, set2);
		Intersection(set1, set2);
	}

	private static Set<Integer> Union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> set3 = new HashSet<>();
		set3.addAll(set1);
		set3.addAll(set2);
		System.out.println("Union:" + set3);
		return set3;
	}

	private static Set<Integer> Intersection(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> set4 = new HashSet<>(set1);
		set4.retainAll(set2);
		System.out.println("Intersection:" + set4);
		return set4;
	}
}
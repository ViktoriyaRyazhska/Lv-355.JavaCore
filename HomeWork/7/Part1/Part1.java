package HomeWork7;

import java.util.HashSet;
import java.util.Set;

public class Part1 {

	public static void main(String[] args) {
		
		Set <String> set1 = new HashSet<String>();
		set1.add("Apple");
		set1.add("LG");
		set1.add("Samsung");
		set1.add("Nokia");
		
		Set <String> set2 = new HashSet<String>();
		set2.add("Xiaomi");
		set2.add("Meizu");
		set2.add("Huawei");
		set2.add("Apple");
		
		Set<String> intersection = new HashSet<String>(set1);
		intersection.retainAll(set2);
		
		System.out.printf("Intersection of two Set %s and %s in Java is %s %n", set1.toString(),set2.toString(), intersection.toString());
		
		
		Set<String> union = new HashSet<String>(set1);
		union.addAll(set2);
		
		System.out.printf("Union of two Set %s and %s in Java is %s %n", set1.toString(),set2.toString(), union.toString());
	}

}

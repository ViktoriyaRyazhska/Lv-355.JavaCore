import java.util.HashSet;
import java.util.Set;

public class Task_1 {
	
	public static Set<String> union(Set<String> set1, Set<String> set2) {
		Set<String> set3 = new HashSet<String>();
		set3.addAll(set2);
		set3.addAll(set1);
		return set3;
	}
	
	public static Set<String> intersect(Set<String> set1, Set<String> set2) {
		Set<String> set3 = new HashSet<String>();
		for (String s1 : set1) {
			for (String s2 : set2) {
				if(s1 == s2) {
					set3.add(s1);
				}
			}
		}
		return set3;
	}
	
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		Set<String> set3 = new HashSet<String>();
		
		set1.add("Pavlo");
		set1.add("Erika");
		set2.add("Roma");
		set2.add("Marta");
		
		set3 = union(set1, set2);
		System.out.println(set3);
		
		set3 = intersect(set1, set2);
		System.out.println(set3);
	}

}

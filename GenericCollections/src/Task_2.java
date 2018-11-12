import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Task_2 {
	
	public static boolean sameName(Map<String, String> personMap) {
		Set<String> firstName = new HashSet<String>();
		firstName.addAll(personMap.values());
		return !(personMap.values().size() == firstName.size());
	}
	
	public static void deletePerson(Map<String, String> personMap, String firstName) {
		if(personMap.containsValue(firstName)) {
			for(Map.Entry<String, String> e: personMap.entrySet()) {
				if(e.getValue().equals(firstName)){
					personMap.remove(e.getKey());
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Map<String, String> personMap = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);

		/*for(int i = 0; i < 5; i++) {		//заповнення Мапи персонів
			System.out.print("Enter last name: ");
			String lastName = sc.next();
			System.out.print("Enter first name: ");
			String firstName = sc.next();
			personMap.put(lastName, firstName);
		}*/
		personMap.put("Yarmoshyk", "Valentyn");
		personMap.put("Yarmosh", "Roma");
		personMap.put("Yarmoshy", "Vitalii");
		personMap.put("Yarmos", "Nastya");
		personMap.put("Yarmo", "Roma");
		System.out.println(personMap);
		
		/*int count = 0;
		List<String> keyList = new ArrayList<String>(personMap.keySet());
		List<String> valueList = new ArrayList<String>(personMap.values());
		for (int i = 0; i < valueList.size() - 1; i++) {
			for(int j = i + 1; j < valueList.size(); j++) {
				if(valueList.get(i) == valueList.get(j)) {
					count++;
				}
			}
		}
		System.out.println("the same name: " + count);*/
		System.out.println("is the same name?: " + sameName(personMap));
		
		System.out.print("Enter the name you want to delete: ");	
		String firstName = sc.next();
		sc.close();
		deletePerson(personMap, firstName);
		/*for(Iterator it = personMap.entrySet().iterator(); it.hasNext();) {
			Map.Entry e = (Entry) it.next();
			if(e.getValue().equals(firstName))
				it.remove();
		}*/
		
		System.out.println(personMap);
		
	}

}

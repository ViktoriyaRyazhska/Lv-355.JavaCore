package hm6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ex2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("surname1", "name1");
		personMap.put("surname2", "name2");
		personMap.put("surname3", "name3");
		personMap.put("surname4", "name4");
		personMap.put("surname5", "name5");
		personMap.put("surname6", "name6");
		personMap.put("surname7", "name7");
		personMap.put("surname8", "name8");
		personMap.put("surname9", "name9");
		personMap.put("surname10", "name10");

		Set<String> mapSet = new HashSet<>(personMap.values());
		if (personMap.size() == mapSet.size()) {
			System.out.println("There are not any persons with the same name");
		} else {
			System.out.println("There are some persons with the same name");
		}

		for (Iterator<Entry<String, String>> i = personMap.entrySet().iterator(); i.hasNext();) {
			Entry<String, String> entry = i.next();
			if (entry.getValue().equals("name1")) {
				i.remove();
			}
		}

		System.out.println("Enter name:");
		String name = br.readLine();

		if (personMap.containsValue(name)) {
			for (Entry<String, String> entry : personMap.entrySet()) {
				if (entry.getValue().equals(name)) {
					System.out.println(entry.getKey());
				}
			}
		} else {
			System.out.println("Error");
		}
	}
}
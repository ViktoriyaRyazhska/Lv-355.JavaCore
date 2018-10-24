package HomeWork7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Part2 {
	static String name;

	public static void main(String[] args) throws IOException {

		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Pachenko", "Sergey");
		personMap.put("Kiyko", "Irina");
		personMap.put("Tarasenko", "Andriy");
		personMap.put("Semenyuk", "Dmytro");
		personMap.put("Tarasovich", "Andriy");
		personMap.put("Morozov", "Denis");
		personMap.put("Gytsyljak", "Taras");
		personMap.put("Kotula", "Pavlo");

		System.out.println(personMap);

		HashSet<String> set = new HashSet<>();
		List<String> list = new ArrayList<String>();

		for (Entry<String, String> mapVal : personMap.entrySet()) {

			if (!set.add(mapVal.getValue())) {
				list.add(mapVal.getValue());

			} else {
				set.add(mapVal.getValue());
			}

		}

		for (Entry<String, String> mapVal : personMap.entrySet()) {

			if (list.contains(mapVal.getValue())) {

				System.out.println("The same firstName: " + mapVal.getValue());
//				System.out.println("The same firstName: " + mapVal.getKey() + " : " + mapVal.getValue());
			}

		}
		removeName(personMap, name);
		System.out.println(personMap);
	}

	public static void removeName(Map<String, String> map, String name) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		name = br.readLine();
		HashMap<String, String> copy = new HashMap<String, String>(map);
		for (Map.Entry<String, String> pair : copy.entrySet()) {
			if (pair.getValue().equals(name)) {
				map.remove(pair.getKey());
			}
		}
	}
}
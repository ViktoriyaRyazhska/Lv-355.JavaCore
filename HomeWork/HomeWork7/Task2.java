import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Shyian", "Andrii");
		map.put("Kurin", "Svyan");
		map.put("Linka", "Roksa");
		map.put("Ostyn", "Orest");
		map.put("Tersn", "Roman");
		map.put("Kyduva", "Omelian");
		map.put("Smart", "Mark");
		map.put("Stanslavska", "Liza");
		map.put("Natalia", "Andrii");
		map.put("Arkadii", "Andrii");
		DisplayEl(map);
		System.out.println();
		System.out.println("After removing:");
		Removing(map);
		FindTheSameFirstName(map);
	}

	public static void DisplayEl(Map<String, String> map) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

	public static void FindTheSameFirstName(Map<String, String> map) {
		Set<String> set = new HashSet<>(map.values());
		if (map.values().size() != set.size()) {
			System.out.println("There are at less two person with the same name)");
		}
	}

	public static void Removing(Map<String, String> map) {
		map.values().remove("Orest");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Andrii");
		map.put(2, "Orest");
		map.put(3, "Oleg");
		map.put(4, "Mark");
		map.put(5, "Khristina");
		map.put(6, "Leo");
		map.put(7, "Sasha");
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ID");
		int a = Integer.parseInt(reader.readLine());
		
		if (map.containsKey(a)) {
			System.out.println(map.get(a));
		}
		String b = reader.readLine();
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			if(entry.getValue().equals(b)) {
				System.out.println(entry.getKey());
				
			}
		}

	}

}

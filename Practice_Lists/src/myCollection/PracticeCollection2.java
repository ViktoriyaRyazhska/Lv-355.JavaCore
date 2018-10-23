package myCollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PracticeCollection2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();

		employeeMap.put(101, "Ann");
		employeeMap.put(102, "Amn");
		employeeMap.put(103, "Angn");
		employeeMap.put(104, "Andn");
		employeeMap.put(105, "Anssn");
		employeeMap.put(106, "Anaen");
		employeeMap.put(107, "Anyyn");
		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("EnterID:101-107");
		Integer enterID = Integer.parseInt(br.readLine());

		if (employeeMap.containsKey(enterID)) {
			System.out.println(enterID + " - " + employeeMap.get(enterID));
		} else {
			System.out.println(" We haven't such ID in the our base");
		}

		System.out.println("Enter Name:");
		System.out.println();
		String enterName = br.readLine();
		if (employeeMap.containsValue(enterName)) {
			for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
				if (entry.getValue().equals(enterName)) {
					System.out.println(enterName + " - " + entry.getKey());
				}
			}
		} else {

			System.out.println(" We haven't such name in the our base");
		}

	}
}

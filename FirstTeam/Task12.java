package firstTeam;

public class Task12 {
	public static void task12() {
		int number = 1000;
		int sum = 0;
		for (int i = 0; i < number; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}

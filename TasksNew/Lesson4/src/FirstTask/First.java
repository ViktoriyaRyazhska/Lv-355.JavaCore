package FirstTask;

public class First {

	public static void main(String[] args) {
		int[] arr = { 2, -5, 7, -4, 8, 3, 11, 16, -6, -2 };
		int tmp;
		int sum = 0;
		int negativesum = 0;
		int s = 0;
		int n = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				s = arr[i];
				continue;
			}
			negativesum += s;

		}


		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int max = arr[0];
		int imax = 0;
		int i = 0;
		for (int k = 0; k < arr.length; k++) {
			if (arr[k] > max) {
				max = arr[k];
				imax = k;
			}
			if (arr[k] < 0) {
				negativesum += arr[k];
			}
			if (arr[k] > 0) {
				sum += arr[k];
			}

		}
		
		System.out.println("Maximum = " + max);
		System.out.println("The most positive number: " + arr[0]);
		System.out.println("The most negative number: " + (arr[arr.length - 1]));
		System.out.println("negativesum = " + negativesum);
		System.out.println("Sum = " + sum);

	}

}

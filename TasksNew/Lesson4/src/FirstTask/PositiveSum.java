package FirstTask;

public class PositiveSum {
	public static void main(String[] args) {
		int[] arr = {2, -5, 7, -4, 8, 10, 12, -8, 3, -15};
		int sum = 0;
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0){
				n  = arr[i];
				continue;
			}
		sum+=n;
			
	}
		System.out.println("Sum = " + sum);
}
	

}

	



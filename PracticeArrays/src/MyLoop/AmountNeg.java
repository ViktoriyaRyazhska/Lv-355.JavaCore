package MyLoop;

public class AmountNeg {

	public void amountNeg(int[] myArray) {
		// TODO Auto-generated method stub
		int amN = 0;
		int amP = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] < 0) {
				amN++;
			} else if (myArray[i] > 0) {
				amP++;
			}
		}
		System.out.println("The amount of negative numbers in the array is: " + amN);
		System.out.println("The amount of positive numbers in the array is: " + amP);
		if (amN > amP) {
			System.out.println("There are more negative numbers in the array");
		} else if (amN < amP) {
			System.out.println("There are more positive numbers in the array");
		}
		else {
			System.out.println("There are equal amount of positive and negative numbers in the array");
		}
		
	}

}

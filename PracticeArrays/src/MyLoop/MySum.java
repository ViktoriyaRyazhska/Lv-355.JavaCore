package MyLoop;

public class MySum {

	public void sum(int[] myArray) {
		// TODO Auto-generated method stub
		int sumA=0;
		
		for (int i=0; i<myArray.length; i++) {
			if(myArray[i]>0) {
				sumA+=myArray[i];
			}
		}
		System.out.println("The sum of positive numbers in the array is:" + sumA);
	}
	

}

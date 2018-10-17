package MyLoop;

public class Biggest {

	public void findBig(int[] myArray) {
		// TODO Auto-generated method stub
		
		int big=0;
		for (int i=0; i<myArray.length;i++) {
			if (myArray[big]<myArray[i]) {
				big=i;
			}
		}
			System.out.println("The biggest number is: "+myArray[big]);
			
		
		
		
	}
	

}

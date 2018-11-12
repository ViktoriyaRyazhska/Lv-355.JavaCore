import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {
public static void start() {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter number of your card");
	int number[] = new int[16];
	for(int i = 0;i<16;i++) {
		try {
			number[i] = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	 if(number[0] ==5 && number[1] == 1  || number[1]==2 || number[1]==3 || number[1]==4 || number[1]==5) {
		 System.out.println("Mastercard");
 }
	 else if (number[0] ==4) {
		 System.out.println("Visa");
	 }
	 else if(number[0] ==3) {
		 System.out.println("American Express");
	 }
	 else if (number[0] ==6 && number[1] ==0) {
		 System.out.println("Discover");
	 }
}
}

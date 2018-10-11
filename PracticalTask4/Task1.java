import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
public static void main(String [] args) throws IOException{
	int a = 0;
	int[] number = new int[3];
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	for(int i = 0;i<3;i++) {
		 number[i] = Integer.parseInt(reader.readLine());
	}
	for(int i = 0;i<3;i++) {
		System.out.println(number[i]);
	}
	for(int i = 0;i<3;i++) {
		if(number[i]%2==0) {
			a++;
		}
	}
	System.out.println("Кількість парних чисел:"+a);
}
}

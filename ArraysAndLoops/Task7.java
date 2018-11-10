/*7.	Задано ціле число  k (від 1 до 180). Визначити, яка цифра знаходиться в k-ій позиції

 *  послідовності 10111213…9899, в якій виписані підряд всі двозначні числа;*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task7 {

	public static void main(String[] args) {
		BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number 180>=n>=1");
		int a=0;
		while(true) {
		try {
		 a = Integer.parseInt(reader.readLine());
		 if(a>=1&&a<=180) {
			 System.out.println("Your number is "+a);
		break;}
		 else {
			 System.err.println("Enter rigth number");
		 }
		 
	}
	catch(IOException | NumberFormatException e) {
		System.err.println("Enter number");
	}}
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1;i<10;i++) {
			for(int j = 0;j<10;j++) {
		    list.add(i);
		    list.add(j);
				
			}
		}
		for(Integer list2:list) {
		System.out.print(list2);
		}
		System.out.println();
		System.out.println(list.get(a-1));
		
		
}
}
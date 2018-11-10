
/*не розумію, як вирішити задачу через масиви  і цикли, як на мене, так легше)))
//Завдання
/*1.	За введеним натуральним числом y - номером деякого року нашої ери, 
обчислити c – номер його століття (врахувати, що, наприклад, початком ХХ століття був 1901, 
а не 1900 рік) та вивести на екран*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int a =0;
    try {
		a = Integer.parseInt(reader.readLine());
	} catch (NumberFormatException e) {
		System.err.println("Enter int number");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(a);
	int b=0;
	 if(a>1000) {	
		 b=a/100+1;
	 }
	 if(a<=1000 || a%100==0) {
			b = a/101+1;
			}
	 
	 System.out.println("Century "+b);
}}

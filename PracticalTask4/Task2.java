import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
public static void main(String [] args) throws IOException {
	BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
	int  number = Integer.parseInt(reader.readLine());
	switch(number) {
	case 1:
		System.out.println("Monday"+" "+"��������"+" "+"����������� ");
		break;
	case 2:
		System.out.println("Tuesday"+" "+"³������"+" "+"������� ");
		break;
	case 3:
		System.out.println("Wednesday"+" "+"������"+" "+"����� ");
		break;
	case 4:
		System.out.println("Thursday"+" "+"������"+" "+"������� ");
		break;
	case 5:
		System.out.println("Friday"+" "+"�'������"+" "+"������ ");
		break;
	case 6:
		System.out.println("Saturday"+" "+"������"+" "+"������� ");
		break;
	case 7:
		System.out.println("Sunday"+" "+"�����"+" "+"�����������");
		break;
}}
}

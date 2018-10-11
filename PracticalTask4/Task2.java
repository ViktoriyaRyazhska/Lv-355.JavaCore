import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
public static void main(String [] args) throws IOException {
	BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
	int  number = Integer.parseInt(reader.readLine());
	switch(number) {
	case 1:
		System.out.println("Monday"+" "+"Понеділок"+" "+"Понедельник ");
		break;
	case 2:
		System.out.println("Tuesday"+" "+"Вівторок"+" "+"Вторник ");
		break;
	case 3:
		System.out.println("Wednesday"+" "+"Середа"+" "+"Среда ");
		break;
	case 4:
		System.out.println("Thursday"+" "+"Четвер"+" "+"Четверг ");
		break;
	case 5:
		System.out.println("Friday"+" "+"П'ятниця"+" "+"Пятніца ");
		break;
	case 6:
		System.out.println("Saturday"+" "+"Субота"+" "+"Суббота ");
		break;
	case 7:
		System.out.println("Sunday"+" "+"Неділя"+" "+"Воскресение");
		break;
}}
}

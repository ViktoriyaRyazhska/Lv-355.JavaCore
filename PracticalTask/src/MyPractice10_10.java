import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyPractice10_10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 
//		Task Product
		Product prod1 = new Product("Samsung", 2500.20, 345);
		Product prod2 = new Product("Roshen", 345.05, 3000);
		Product prod3 = new Product("Sony", 3400.35, 300);
		Product prod4 = new Product("Panasonic", 1345, 30);
		System.out.println("The most expensive product: ");
		if ((prod1.getPrice()>prod2.getPrice())&& (prod1.getPrice()>prod3.getPrice())&&(prod1.getPrice()>prod4.getPrice())){
		System.out.println(prod1.toString());
		}
		
		if ((prod2.getPrice()>prod1.getPrice())&& (prod2.getPrice()>prod3.getPrice())&&(prod2.getPrice()>prod4.getPrice())){
			System.out.println(prod2.toString());
			}
		
		if ((prod3.getPrice()>prod2.getPrice())&& (prod3.getPrice()>prod1.getPrice())&&(prod3.getPrice()>prod4.getPrice())){
			System.out.println(prod3.toString());
			}
		
		if ((prod4.getPrice()>prod1.getPrice())&& (prod4.getPrice()>prod3.getPrice())&&(prod4.getPrice()>prod2.getPrice())){
			System.out.println(prod4.toString());
			}
				
		System.out.println("=========================");
		System.out.println("The biggest quantity of product: ");
		
		if ((prod1.getQuantity()>prod2.getQuantity())&& (prod1.getQuantity()>prod3.getQuantity())&&(prod1.getQuantity()>prod4.getQuantity())){
			System.out.println(prod1.toString());
			}
		if ((prod2.getQuantity()>prod1.getQuantity())&& (prod2.getQuantity()>prod3.getQuantity())&&(prod2.getQuantity()>prod4.getQuantity())){
			System.out.println(prod2.toString());
			}
		if ((prod3.getQuantity()>prod1.getQuantity())&& (prod3.getQuantity()>prod2.getQuantity())&&(prod3.getQuantity()>prod4.getQuantity())){
			System.out.println(prod3.toString());
			}
		if ((prod4.getQuantity()>prod1.getQuantity())&& (prod4.getQuantity()>prod2.getQuantity())&&(prod4.getQuantity()>prod3.getQuantity())){
			System.out.println(prod2.toString());
			}
			
		System.out.println("======================");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1 task");
		int calc=0;
		System.out.println("Enter 1st number");
		int number1 = Integer.parseInt(br.readLine());
		if (number1%2!=0) {calc++;} 
		System.out.println("Enter 2st number");
		int number2 = Integer.parseInt(br.readLine());
		if (number2%2!=0) {calc++;} 
		System.out.println("Enter 3st number");
		int number3 = Integer.parseInt(br.readLine());
		if (number3%2!=0) {calc++;} 
		System.out.println("You enter "+calc+" odd number(s)");
		System.out.println("__________");
		
		System.out.println("2 task");
		System.out.println("Enter number of the day of the week from 1 to 7 (1-Monday)");
		int numberDay = Integer.parseInt(br.readLine());
		switch (numberDay) {
		case 1:
			System.out.println("Monday");
			System.out.println("Понеділок");
			System.out.println("Понедельник");
		break;
		case 2:
			System.out.println("Tuesday");
			System.out.println("Вівторок");
			System.out.println("Вторник");
		break;
		case 3:
			System.out.println("Wednesday");
			System.out.println("Середа");
			System.out.println("Среда");
			break;
		case 4:
			System.out.println("Thursday");
			System.out.println("Четвер");
			System.out.println("Четверг");
		break;
		case 5:
			System.out.println("Friday");
			System.out.println("П'ятниця");
			System.out.println("Пятница");
		break;
		case 6:
			System.out.println("Saturday");
			System.out.println("Субота");
			System.out.println("Суббота");
		break;
		case 7:
			System.out.println("Sunday");
			System.out.println("Неділя");
			System.out.println("Воскресенье");
		break;
		default: System.out.println("Number is not from 1 to 7");
		break;
		}
		System.out.println("3 task");
		Continent continent = null;
		System.out.println("Enter the country:");
		String country = br.readLine();
		switch (country) {
		case "Canada":
		case "USA":
		case "Mexico":
			continent = Continent.NORTH_AMERICA;
			break;
		case "Ukraine":
		case "Poland":
		case "France":
		case "German":
			continent = Continent.EUROPE;
			break;
		case "China":
		case "Kazakhstan":
		case "Japan":
			continent = Continent.ASIA;
			break;
		case "Brazilia":
		case "Chili":
		case "Argentina":
			continent = Continent.SOUTH_AMERICA;
			break;
		case "Australia":
			continent = Continent.AUSTRALIA;
			break;
		case "Ghana":
		case "Egipt":
		case "Libia":
			continent = Continent.AFRICA;
			break;
		default:
			System.out.println("Not such country in our base");
			break;
		}
		if (continent != null) {
			System.out.println(country + " is situated at " + continent);
		}
	}

	

	enum Continent {
		EUROPE, ASIA, AUSTRALIA, NORTH_AMERICA, SOUTH_AMERICA, AFRICA
	}

}

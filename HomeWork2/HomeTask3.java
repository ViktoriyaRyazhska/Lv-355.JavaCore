import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask3 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Minutes you talk with american:" + " ");
		int America = Integer.parseInt(reader.readLine());
		System.out.println("Minutes you talk with italian:" + " ");
		int Italy = Integer.parseInt(reader.readLine());
		System.out.println("Minutes you talk with germanian:" + " ");
		int Germany = Integer.parseInt(reader.readLine());
		double moneyAm = America * 2.25;
		double moneyIt = Italy * 1.75;
		double moneyGer = Germany * 2.00;
		double summMoney = moneyAm + moneyIt + moneyGer;
		System.out.println("Money for call from America:"+" " + moneyAm);
		System.out.println("Money for call from Italy:"+" " + moneyIt);
		System.out.println("Money for call from Germany:"+" " + moneyGer);
		System.out.println("Summ of money for the calls:"+" " + summMoney);

	}

}

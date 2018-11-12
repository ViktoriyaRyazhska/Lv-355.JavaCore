import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirdTask {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter price of dollar");
		
		double backs = Double.parseDouble(br.readLine());
System.out.println("Enter how many hryvnas you have");
int gryvna = Integer.parseInt(br.readLine());

int backsBuyed = (int) (gryvna/backs);
System.out.println("You've buyed: " + backsBuyed);
double left = (gryvna%backs);;
System.out.println("you have left " + left + " gryvnas");
	}

}

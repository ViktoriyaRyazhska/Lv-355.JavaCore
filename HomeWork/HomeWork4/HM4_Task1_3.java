import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM4_Task1_3 {

	public static void main(String[] args) throws IOException {
		HM4_Task1_3 d = new HM4_Task1_3();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(reader.readLine());
		System.out.println(d.LN(a));
	}

	public Enum  LN(int a) {
		Enum error = null;
		switch (a) {
		case (400):
			error = Enum.BadRequwest;
			break;
		case (401):
			error = Enum.PaymentRequired;
			break;
		case (402):
			error = Enum.Unauthorized;
			break;
		}
		return error;
	}

}

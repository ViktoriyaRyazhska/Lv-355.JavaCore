import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;

public class HomeWorkUnit13 {

	public static void main(String[] args) throws IOException {

		String country = JOptionPane.showInputDialog("Enter name of 1-st Country");
		String country1 = JOptionPane.showInputDialog("Enter name of 2-nd Country");
		String country2 = JOptionPane.showInputDialog("Enter name of 3-rd Country");

		String cos = JOptionPane.showInputDialog("Enter value per minute for 1-st Country");
		double cost = Double.parseDouble(cos);
		String cos1 = JOptionPane.showInputDialog("Enter value per minute for 2-nd Country");
		double cost1 = Double.parseDouble(cos1);
		String cos2 = JOptionPane.showInputDialog("Enter value per minute for 3-rd Country");
		double cost2 = Double.parseDouble(cos2);

		String tim = JOptionPane.showInputDialog("Enter Time of 1-st Country (minute)");
		double time = Double.parseDouble(tim);
		String tim1 = JOptionPane.showInputDialog("Enter Time of 2-nd Country (minute)");
		double time1 = Double.parseDouble(tim1);
		String tim2 = JOptionPane.showInputDialog("Enter Time of 3-rd Country (minute)");
		double time2 = Double.parseDouble(tim2);

		double price = cost * time; // (Price for 1-st Country)
		double price1 = cost1 * time1; // (Price for 2-nd Country)
		double price2 = cost * time2; // (Price for 3-rd Country)
		double total_price = price + price1 + price2;

		JOptionPane.showMessageDialog(null, "Final information:\n" + country + " " + price + "\n" + country1 + " "
				+ price1 + "\n" + country2 + " " + price2, "Answer", JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, "Total Price:\n" + total_price, "Answer", JOptionPane.INFORMATION_MESSAGE);

	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;

public class HomeWorkUnit12 {

	public static void main(String[] args) throws IOException {

//		String name;
//		String address;
//
//		name = JOptionPane.showInputDialog("What is your name?");
//		address = JOptionPane.showInputDialog("Where are you live? " + name);
//
//		JOptionPane.showMessageDialog(null, "Personal information:\n" + name + "\n" + address, "Answer",
//				JOptionPane.INFORMATION_MESSAGE);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("What is your name?");
		String name = br.readLine();
		System.out.println("Where are you live? " + name);
		String address = br.readLine();
		System.out.println("Persional information:\n" + name + "\n" + address);
	}
}

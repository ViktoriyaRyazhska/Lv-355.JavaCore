import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;

public class HomeWorkUnit11 {

	public static void main(String[] args) throws IOException {
		
		String rad;

		double perimeter;
		double area;

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//System.out.println("Enter radius of bed");

		//double radius = Double.parseDouble(br.readLine());
		
		rad = JOptionPane.showInputDialog("Enter the Radius of bed:");
		
		double radius = Double.parseDouble(rad); 

		perimeter = 2 * Math.PI * radius;
		double roundOff = Math.round(perimeter * 100) / 100.00;

		area = Math.PI * Math.pow(radius, 2); // може бути area = Math.PI*radius*radius;
		double roundOf = Math.round(area * 100) / 100.00;
		
		 JOptionPane.showMessageDialog(null,"Your perimeter is " + roundOff,"Answer", JOptionPane.INFORMATION_MESSAGE);
	     JOptionPane.showMessageDialog(null,"Your area is " + roundOf, "Answer", JOptionPane.INFORMATION_MESSAGE);

		//System.out.println("Your perimeter is " + roundOff);
		//System.out.println("Your area is " + roundOf);

	}
}

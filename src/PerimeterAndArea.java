import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerimeterAndArea {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius of circle");
		int radius = Integer.parseInt(reader.readLine());
		double perimeter = 2*(3.14*radius);
		double area = 3.14*(radius*radius);
		System.out.println("Your perimeter is"+" "+perimeter);
		System.out.println("Your area is"+" "+area);

	}

}

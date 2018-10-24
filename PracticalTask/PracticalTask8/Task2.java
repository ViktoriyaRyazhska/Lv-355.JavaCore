import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter surname, name, pathronic");
		String snp = reader.readLine();
		System.out.println(snp);
		String[] s1 = snp.split(" ");
		for(String d:s1) {
			System.out.println(d);
		}
		System.out.println("Surname with initials: "+s1[0]+" "+s1[1].substring(0,1)+" "+s1[2].substring(0,1));
		System.out.println("Name:"+" "+s1[1]);
		System.out.println(s1[1]+" "+s1[2]+" "+s1[0]);
		

	}

}

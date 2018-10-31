import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) throws IOException {
		String fileName = "1.txt";
		FileReader fl = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fl);
		String s;
		ArrayList<String> list = new ArrayList<>();
		while ((s = br.readLine()) != null) {
			list.add(s);
		}
		int a = 1;
		int j = 1;
		for (int i = 0; i < list.size(); i++) {
			System.out.println("The length of line " + a + ":" + " " + list.get(i).length());
			a++;
		}
		int min = list.get(0).length();
		int max = list.get(0).length();
		for (int i = 0; i < list.size(); i++) {
			if (min > list.get(i).length()) {
				min = list.get(i).length();
			}
			if(max<list.get(i).length()) {
				max=list.get(i).length();
			}
			if(list.get(i).contains("var")) {
				System.out.println("Line"+j+" "+" which contains var"+list.get(i));
				j++;
			}
			
			
		}
		System.out.println("Minimum "+min);
		System.out.println("Maximum "+max);
	}

}

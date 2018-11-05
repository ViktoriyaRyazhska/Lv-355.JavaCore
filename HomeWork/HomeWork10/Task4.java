import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class Task4 {
	public static void main(String[] args) throws IOException {
		String fileName = "1.txt";
		FileReader f1 = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(f1);
		Writer f2 = new FileWriter("2.txt");
		String s;
		ArrayList<String> list = new ArrayList<String>();
		while ((s = reader.readLine()) != null) {
			list.add(s);
		}
		int a = list.get(0).length();
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() > a) {
				a = list.get(i).length();
				index = i;
			}
		}
		f2.append(list.get(index));
		f2.append("\n");
		f2.write("Number of lines: "+list.size());
		f2.append("\n");
		String name = "";
		String date = "";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("Name")) {
				name = list.get(i);
			}
			if (list.get(i).contains("Date of birth")) {
				date = list.get(i);
				
			}
		}
		
		f2.append(name);
		f2.append("\n");
		f2.append(date);
		f2.close();

	}

}


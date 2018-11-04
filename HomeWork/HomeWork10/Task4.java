import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
		FileOutputStream f = new FileOutputStream("2.txt");
		Writer f2 = new FileWriter("2.txt");
		String s;
		ArrayList<String> list = new ArrayList<String>();
		while ((s = reader.readLine()) != null) {
			list.add(s);
		}
		System.out.println("Lines in your text: " + list.size());
		int a = list.get(0).length();
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() > a) {
				a = list.get(i).length();
				index = i;
			}
		}
		System.out.println("The longest line: " + list.get(index) + a);
		byte[] buffer = list.get(index).getBytes();
		f.write(buffer, 0, buffer.length);
		f2.write(list.size() + "");
		f2.append("\n");
		f2.close();
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
		byte[] buffer2 = name.getBytes();
		f.write(buffer2, 0, buffer2.length);
		byte[] buffer3 = date.getBytes();
		f.write(buffer3, 0, buffer3.length);
		System.out.println(name);
		System.out.println(date);

	}

}

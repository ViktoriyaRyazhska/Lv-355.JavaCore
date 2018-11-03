package hm9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ex4 {
	public static void main(String[] args) throws IOException {
		List<String> arrs = new ArrayList<String>();
		String fileName = "file1.txt";
		FileReader fr = null;
		BufferedReader br = null;
		String s = null;
		fr = new FileReader(fileName);
		br = new BufferedReader(fr);

		while ((s = br.readLine()) != null) {
			arrs.add(s);
		}
		br.close();
		int max = arrs.get(0).length();
		int i = 0;
		int j = 0;
		while (i < arrs.size()) {
			if (arrs.get(i).length() > max) {
				j = i;
			}
			i++;
		}

		FileWriter fw = null;
		BufferedWriter bw = null;
		String fileName1 = "file2.txt";

		try {
			fw = new FileWriter(fileName1);
			bw = new BufferedWriter(fw);
			bw.write(arrs.size() + "\n");
			bw.write(arrs.get(j) + "\n");
			bw.write("Danylo, 06.04");
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
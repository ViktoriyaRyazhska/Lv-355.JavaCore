import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) throws IOException {
		File file = new File("file.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		File fileTrue = new File("fileTrue.txt");
		if(!fileTrue.exists()) {
			fileTrue.createNewFile();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter yout sentence: ");
		String s = sc.nextLine();
		sc.close();

		s = s.replaceAll("\\s+"," ").trim();
		
		//replaceString(s);
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
		bufferedWriter.write("I am");
		bufferedWriter.newLine();
		bufferedWriter.write("He is");
		//bufferedWriter.flush();
		bufferedWriter.close();
//		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		BufferedReader buffRed = new BufferedReader(new FileReader(fileTrue));
		int count1 = 0;
		int count2 = 0;
		boolean y = true;
		String line;
		String lineTrue;
		String ln="";
		while((line = bufferedReader.readLine()) != null) {
			if(y) {
				count1++;
			}
			if(s.contains(line)) {
				//System.out.println(line + " " +count1);
				ln = line;
				y = false;
			}
		}
		while((lineTrue = buffRed.readLine()) != null) {
			count2++;
			if(count2 == count1) {
				break;
			}
		}
		//System.out.println(lineTrue + " blablabla");
		System.out.println(ln);
		//System.out.println(ln);
		
		//while((line = bufferedReader.readLine()) != null) {
		if(s.contains(ln)) {
			System.out.println(ln);
			s = s.replaceAll(ln, lineTrue);
		}
		//}
		
		bufferedReader.close();
//		while(buffRed.ready()) {
//			System.out.println(buffRed.readLine());
//		}
		buffRed.close();
		
		
		
		
		
		
		
		
		
		System.out.println("After editting: "+s);
	}
}
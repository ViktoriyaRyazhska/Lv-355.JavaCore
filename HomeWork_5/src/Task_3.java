import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		
		int[] mas = new int[1000];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int pos = 0;
		int mass[] = new int[5];
		boolean y = true;
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print("Enter " + i + " number: ");
			mas[i] = sc.nextInt();
			
			if(y == true) {
				if(mas[i] < 0) {
					pos = i;
					y = false;
				}
			}
			if(pos!=0) {
			if(i == pos+4)
				break;
			}
		}
		
		int second = -1;
		int position = 0;
		int min = mass[0];
		int prod = 1;
		for (int j = 0; j < mass.length; j++) {
			mass[j] = mas[pos+j];
			
			if(mass[j] > 0) {
				count++;
			}
			if(count == 2) {
				if(second == -1)
					second = j;
			}
			
			if(mass[j] < min) {
				min = mass[j];
				position = j;
			}
			if(mass[j] % 2 == 0) {
				prod *= mass[j];
			}
		}
		System.out.println("Min: " + min + " Position: " + position);
		System.out.println("Prod: " + prod);
		if(second != -1)
			System.out.println("Second pos: " + second);
		else System.out.println("Positive elements are missing");
		
		sc.close();
	}

}

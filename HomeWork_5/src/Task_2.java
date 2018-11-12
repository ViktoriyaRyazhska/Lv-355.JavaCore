import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] mas = new int [10];
		int sum = 0;
		int prod = 1;
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = sc.nextInt();
			if(i < 5) {
			if(mas[i] > 0) {
				sum += mas[i];
				count++;
				if(count == mas.length/2 && i == 4) {
					System.out.println("Sum:" + sum);
					break;
				}
			}}else if(i >= 5) {
				prod *= mas[i];
				if(i == mas.length - 1)
					System.out.println("Prod:" + prod);
			}
				
		}
		sc.close();
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HW4_Task1_2 {
	
	public static void main(String[] args) {
		HW4_Task1_2 n1 =new  HW4_Task1_2();
		System.out.println("Max"+" "+n1.MaxEl(4, 2, 6));
		System.out.println("Min"+" "+n1.MinEl(3, 1, 8));
	}

	public int MaxEl(int a, int b, int c) {
		if (a > b && a > c) {
			return  a;
		}
		if (b > a && b > c) {
			return b;
		} 
			return c;
		
	}

	public int  MinEl(int a, int b, int c) {
		if (a < b && a < c) {
			return a;
		}
		if (b < a && b < c) {
			return  b;
		} 
			return  c;
		
	}
}

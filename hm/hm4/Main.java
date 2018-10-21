package hm4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Car[] c = new Car[4];
		c[0] = new Car("name1", 2014, 100);
		c[1] = new Car("name2", 2018, 200);
		c[2] = new Car("name3", 2012, 400);
		c[3] = new Car("name4", 2017, 300);
		
		System.out.println("Car's year (2012, 2014, 2017, 2018)");
		int y = Integer.parseInt(br.readLine());
		for (int f = 0; f < c.length; f++) {
			if (c[f].getYear() == y) {
				System.out.println(c[f]);
			}
		}
		
		Car tmp;
		for (int i = 0; i < c.length - 1; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i].getYear() < c[j].getYear()) {
					tmp = c[i];
					c[i] = c[j];
					c[j] = tmp;
				}
			}
		
	}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
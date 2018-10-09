package hm2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Person p1 = new Person();
		p1.info(br);
		System.out.println(p1);
		
		Person p2 = new Person("name2");
		p2.setBirthYear(2000);
		System.out.println(p2);
		
		Person p3 = new Person("name3", 2001);
		System.out.println(p3);
		
		Person p4 = new Person("name2", 2002);
		System.out.println(p4);
		
		Person p5 = new Person("name2", 2003);
		System.out.println(p5);
	}
}

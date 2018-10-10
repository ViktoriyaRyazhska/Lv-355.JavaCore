import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

/**
 * @author User
 *
 */
public class Program {

	public static void main(String[] args) throws IOException {
		// LocalDate today = LocalDate.now();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Person m1 = new Person();
		m1.setBirthYear(1993);
		m1.setName("Orest");
		
		Person m2 = new Person();
		m2.input(br);
		
		Person m3 = new Person();
		m3.input(br);
		Person m4 = new Person();
		m4.input(br);
		
		Person m5 = new Person();
		
		m5.input(br);

		//Object[] Person = new Person[5];
		//Person [0] = new Person();
		//		Person [1] = new Person();
			//			Person [2] = new Person();
			//					Person [3] = new Person();
			//							Person [4] = new Person();
		 
	
		
		//for (i=0; i<5; i++) {
		//	System.out.println(Person[i]);
	//	}
		System.out.println(m1.age());
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
	}

}
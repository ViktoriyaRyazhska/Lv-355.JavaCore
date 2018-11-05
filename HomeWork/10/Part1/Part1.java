package HomeWork10;

public class Part1 {

	public static void main(String[] args) throws InterruptedException {

		Part1_1 t1 = new Part1_1();
		Part1_2 t2 = new Part1_2();
	
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("My name is Susie");
		}
		
		System.out.println("Out of circle");
	}

}

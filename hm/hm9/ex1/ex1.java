package hm9;

public class ex1 {
	public static void main(String[] args) throws InterruptedException {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		t3.start();
	}
}

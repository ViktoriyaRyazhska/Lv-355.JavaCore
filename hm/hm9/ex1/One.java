package hm9;

public class One extends Thread {
	public void run() {
		Two t2 = new Two();
		t2.start();
		System.out.println("One");
	}
}

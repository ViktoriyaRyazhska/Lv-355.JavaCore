package hm9;

public class Two extends Thread {
	public void run() {
		Three t3 = new Three();
		t3.start();
		for (int i = 0; i < 3; i++) {
			System.out.println("Two");
			try {
				sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

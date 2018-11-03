package hm9;

public class Three extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Three");
		}
	}
}

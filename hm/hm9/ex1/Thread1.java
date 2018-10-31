package hm9;

public class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Message #1");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

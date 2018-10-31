package hm9;

public class Thread2 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Message #2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

package hm9;

public class Thread3 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Message #3");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

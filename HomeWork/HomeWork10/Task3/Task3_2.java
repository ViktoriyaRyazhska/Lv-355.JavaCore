
public class Task3_2 extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread two");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			
		}
		Thread t2 = new Task3_3();
		t2.start();
	}
}

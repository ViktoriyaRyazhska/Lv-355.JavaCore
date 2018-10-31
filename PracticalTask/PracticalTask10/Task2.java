
public class Task2 extends Thread {
	private String line;
	private int pause;

	public Task2(String line, int pause) {
		this.line = line;
		this.pause = pause;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(pause);
				System.out.println(line);
			} catch (InterruptedException e) {

			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Task2("Hello world", 2000);
		Thread t2 = new Task2("Peace in peace", 3000);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("My name is Andrew");

	}
}

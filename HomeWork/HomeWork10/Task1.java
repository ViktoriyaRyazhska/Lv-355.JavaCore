
public class Task1 extends Thread {
	private String text;

	public Task1(String text) {
		this.text = text;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(text);
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Task1("Message from first thread");
		Thread t2 = new Task1("Message from second thread");
		Thread t3 = new Task1("Message from third thread");
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
		
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			
		}
		t3.start();
		
	}

}

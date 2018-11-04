
public class Task2  extends Thread{
	public final static Object first = new Object();
	public final static Object second = new Object();
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				synchronized(first) {
					Thread.yield();
					try {
						Thread.sleep(100);
					}
					catch(Exception e) {
												}
					synchronized(second) {
						System.out.println("Think different");
					}
				}
			}
		};
		t1.start();
		synchronized(second) {
			Thread.yield();
		synchronized(first) {
			System.out.println("Think different");
		}}
	}
	}


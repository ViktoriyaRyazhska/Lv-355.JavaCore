package HomeWork10;

public class Part3_3 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread number three");
		}
	}

}

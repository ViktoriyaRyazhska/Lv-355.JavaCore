package HomeWork10;

public class Part2_Deadlock {

	String s1 = "I`am super hero";
	String s2 = "You are just Dima";

	Thread t1 = new Thread() {
		public void run() {
			synchronized (s1) {
				Thread.yield();
				synchronized (s2) {
					System.out.println(s1 + " " + s2);
				}
			}
		}
	};
	Thread t2 = new Thread() {
		public void run() {
			synchronized (s2) {
				Thread.yield();
				synchronized (s1) {
					System.out.println(s2 + " " + s1);
				}

			}
		}
	};

	public static void main(String[] args) {

		Part2_Deadlock t = new Part2_Deadlock();
		t.t1.start();
		t.t2.start();

	}

}

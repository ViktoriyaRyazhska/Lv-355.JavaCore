package HomeWork6;

public class BirdBoss {

	public static void main(String[] args) {
		
		Bird [] b = new Bird [4];
		b[0] = new Eagle ("Має пір'я", "Відкладає яйця");
		b[1] = new Swallow ("Має пір'я", "Відкладає яйця");
		b[2] = new Penguin ("Не має пір'я", "Відкладає яйця");
		b[3] = new Kiwi ("Має пір'я", "Відкладає яйця");
		
		for(int i = 0; i<b.length; i++) {
			b[i].fly();
		}
	}

}

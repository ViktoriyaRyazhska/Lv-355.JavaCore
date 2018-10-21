package hm5;

public class ApplBird {

public static void main(String[] args) {
		
		Bird[] b = new Bird[5];
		
		b[0] = new Eagle("Cool feathers", 7);
		b[1] = new Swallow("Good feathers", 3);
		b[2] = new Penguin("Bad feathers", 5);
		b[3] = new Chicken("No good  feathers", 5);
		b[4] = new Swallow("Veru cool feathers", 9);

	for (int i = 0; i < b.length; i++) {
		b[i].fly();
	}
	}

}

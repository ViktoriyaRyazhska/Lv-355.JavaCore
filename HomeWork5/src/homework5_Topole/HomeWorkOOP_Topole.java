package homework5_Topole;

public class HomeWorkOOP_Topole {

	public static void main(String[] args) {
		Bird[] bird = new Bird[8];
		bird[0] = new Eagle();
		bird[1] = new Swallow();
		bird[2] = new Eagle();
		bird[3] = new Penguin();
		bird[4] = new Chicken();
		bird[5] = new Chicken();
		bird[6] = new Penguin();
		bird[7] = new Swallow();
for (int i=0; i<bird.length; i++) {
	System.out.print((i+1)+" bird: ");
	bird[i].fly();
	System.out.println(bird[i].toString());
}
		
	}

}


public class Main {

	public static void main(String[] args) {
		Bird[] birds = { new Swallow(), new Eagle(), new Pinguin(), new Chicken() };
		birds[0].setFeather(true);
		birds[0].setLayEggs(true);
		birds[1].setFeather(true);
		birds[1].setLayEggs(false);
		birds[2].setFeather(true);
		birds[2].setLayEggs(false);
		birds[3].setFeather(false);
		birds[3].setLayEggs(false);
		int n=1;
		for (int i = 0; i < birds.length; i++) {
			System.out.println(n+")"+" "+birds[i].toString());
			System.out.println("Does that bird with feather?"+" "+ birds[i].getFeather());
			System.out.println("Does that bird lay Eggs?"  + " " + birds[i].getLayEggs());
			System.out.println("Does it fly?" + " " + birds[i].fly());
			n++;
		
	}}
}

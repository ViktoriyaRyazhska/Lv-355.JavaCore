
public class Main {

	public static void main(String[] args) {
		Bird [] birds = {new Swallow(),new Eagle(), new Pinguin(),new Chicken()};
for(int i = 0;i<birds.length;i++) {
	System.out.println(birds[i].getClass());
	System.out.println("Does that bird with feather?"+" "+birds[i].feather);
	System.out.println("Does that bird lay Eggs?"+" "+birds[i].layEggs);
	System.out.println("Does it fly?"+" "+birds[i].fly());
}
	}

}

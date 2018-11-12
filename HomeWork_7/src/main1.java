
public class main1 {

	public static void main(String[] args) {
		Bird[] b = {new Eagle(10, 20),
				new Swallow(15 , 15),
				new Penguin(20, 20),
				new Chicken(25, 25)	
		};

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		 
	}

}

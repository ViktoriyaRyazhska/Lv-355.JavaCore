
public class NonFlyingBird extends Bird{
	
	public NonFlyingBird(int layEggs, int feathers) {
		super(layEggs, feathers);
	}
	
	@Override
	public String canFly() {
		return "cant fly";
	}

}


public class FlyingBird extends Bird{
	
	public FlyingBird(int layEggs, int feathers) {
		super(layEggs, feathers);
	}
	
	
	
	@Override
	public String canFly() {
		return "can fly";
	}

}

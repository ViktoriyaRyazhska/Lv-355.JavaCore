
public class Penguin extends NonFlyingBird{

	public Penguin(int layEggs, int feathers) {
		super(layEggs, feathers);
	}

	@Override
	public String toString() {
		return "Penguin [layEggs=" + getLayEggs() + ", feathers=" + getFeathers() + ", " + canFly() +"]";
	}

}

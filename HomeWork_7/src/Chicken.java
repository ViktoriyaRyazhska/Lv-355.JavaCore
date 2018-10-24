
public class Chicken extends NonFlyingBird{

	@Override
	public String toString() {
		return "Chicken [layEggs=" + getLayEggs() + ", feathers=" + getFeathers() + ", " + canFly() +"]";
	}

	public Chicken(int layEggs, int feathers) {
		super(layEggs, feathers);
	}

}

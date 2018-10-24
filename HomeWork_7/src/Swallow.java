
public class Swallow extends FlyingBird{

	public Swallow(int layEggs, int feathers) {
		super(layEggs, feathers);
	}

	@Override
	public String toString() {
		return "Swallow [layEggs=" + getLayEggs() + ", feathers=" + getFeathers() + ", " + canFly() + "]";
	}

}

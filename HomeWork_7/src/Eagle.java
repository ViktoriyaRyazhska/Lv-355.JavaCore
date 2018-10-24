
public class Eagle extends FlyingBird{

	public Eagle(int layEggs, int feathers) {
		super(layEggs, feathers);
	}

	@Override
	public String toString() {
		return "Eagle [layEggs=" + getLayEggs() + ", feathers=" + getFeathers() + ", " + canFly() + "]";
	}

}

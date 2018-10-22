package HomeWork6;

public class Swallow extends FlyingBird {

	public Swallow(String feathers, String layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	void fly() {
		System.out.println("Ластівка може літати " + "\t" + getFeathers() + "\t" + getLayEggs());
		
	}

}

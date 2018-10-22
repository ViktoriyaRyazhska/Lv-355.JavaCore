package HomeWork6;

public class Eagle extends FlyingBird {

	public Eagle(String feathers, String layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	void fly() {
		System.out.println("ќрeл може л≥тати " + "\t" + getFeathers() + "\t" + getLayEggs());
		
	}

}

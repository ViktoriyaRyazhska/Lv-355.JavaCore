package HomeWork6;

public class Penguin extends NonFlyingBird {

	public Penguin(String feathers, String layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	void fly() {
		System.out.println("ϳ���� �� ���� ����� " + "\t" + getFeathers() + "\t" + getLayEggs());
		
	}

}

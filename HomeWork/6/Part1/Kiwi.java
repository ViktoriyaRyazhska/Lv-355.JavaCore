package HomeWork6;

public class Kiwi extends NonFlyingBird {

	public Kiwi(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	void fly() {
		System.out.println("ʳ� �� ���� ����� " + "\t" + getFeathers() + "\t" + getLayEggs());
	}

}

package HomeWork6;

public class Eagle extends FlyingBird {

	public Eagle(String feathers, String layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	void fly() {
		System.out.println("��e� ���� ����� " + "\t" + getFeathers() + "\t" + getLayEggs());
		
	}

}

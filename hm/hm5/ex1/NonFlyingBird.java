package hm5;

public abstract class NonFlyingBird extends Bird {

	@Override
	public void fly() {
		System.out.println("I cannot fly:-(");
	}

}
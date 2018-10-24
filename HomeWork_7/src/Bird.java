
public abstract class Bird {
	private int layEggs = 0;
	private int feathers = 0;
	
	public int getLayEggs() {
		return layEggs;
	}

	public void setLayEggs(int layEggs) {
		this.layEggs = layEggs;
	}

	public int getFeathers() {
		return feathers;
	}

	public void setFeathers(int feathers) {
		this.feathers = feathers;
	}

	public Bird(int layEggs, int feathers) {
		this.layEggs = layEggs;
		this.feathers = feathers;
	}
	
	public abstract String canFly();
}

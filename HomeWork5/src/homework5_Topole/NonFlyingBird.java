package homework5_Topole;

public class NonFlyingBird extends Bird{

	@Override
	public void setFeathers(String feathers) {
		// TODO Auto-generated method stub
		super.setFeathers(feathers);
	}
	@Override
		public void setLayEggs(String layEggs) {
			// TODO Auto-generated method stub
			super.setLayEggs(layEggs);
		}
	@Override
	public String getFeathers() {
		// TODO Auto-generated method stub
		return super.getFeathers();
	}
	@Override
	public String getLayEggs() {
		// TODO Auto-generated method stub
		return super.getLayEggs();
	}
	@Override
	void fly() {
		System.out.println("I cann't fly, but I can run");		
	}

}

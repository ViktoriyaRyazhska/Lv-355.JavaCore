package homework5_Topole;

public class FlyingBird extends Bird{
	
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
	public String getLayEggs() {
		// TODO Auto-generated method stub
		return super.getLayEggs();
	}
	@Override
	public String getFeathers() {
		// TODO Auto-generated method stub
		return super.getFeathers();
	}
	
	@Override
	void fly() {
		System.out.println("I can fly");
		
	}
	
	

}

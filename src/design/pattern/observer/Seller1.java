package design.pattern.observer;

public class Seller1 implements Observer{

	String location;
	
	@Override
	public void update(String location) {
		this.location = location;
		showlocation();
	}
	private void showlocation() {
		System.out.println("From Seller1 >> "+ this.location);
	}

}

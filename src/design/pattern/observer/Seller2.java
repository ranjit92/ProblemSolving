package design.pattern.observer;

public class Seller2 implements Observer{

	String location;
	
	@Override
	public void update(String location) {
		this.location = location;
		showlocation();
	}
	private void showlocation() {
		System.out.println("From Seller2 >> "+ this.location);
	}

}

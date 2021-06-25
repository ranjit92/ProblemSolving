package design.pattern.observer;

public class Main {
	public static void main(String[] args) {
		DataDelivery obserbable = new DataDeliveryImpl();
		
		Observer seller1 = new Seller1();
		Observer seller2 = new Seller2();
		
		obserbable.addObserver(seller1);
		obserbable.addObserver(seller2);
		
		obserbable.setLocation("BTM");
		
		
		obserbable.notifyAllObserver();
		
		obserbable.removeObserver(seller2);
		
		System.out.println("-----------------------");
		obserbable.notifyAllObserver();
	}
}

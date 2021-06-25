package design.pattern.command;

public class Stock {

	String name = "ABC";
	int quentity = 50;
	
	public void buyStock() {
		System.out.println("Stock buy");
	}
	
	public void sellStock() {
		System.out.println("Stock sell");
	}
	
}

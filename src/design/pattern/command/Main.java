package design.pattern.command;

public class Main {

	public static void main(String[] args) {
		Stock stock  = new Stock();
		Order sellorder = new SellStock(stock);
		Order buyorder = new BuyStock(stock);
		
		Broker broker = new Broker();
		broker.takeOrder(sellorder);
		broker.takeOrder(buyorder);
		broker.placeOrder();
	}
}

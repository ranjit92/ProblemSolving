package problems.common.completablefutute;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
	
	
	public static void main(String[] args) {
		CompletableFuture<Order> orderFuture = CompletableFuture.supplyAsync(() -> getOrder())
		.thenApply(order -> payment(order))
		.exceptionally(e -> failedOrder())
		.thenApply(order -> dispatch(order))
		.thenApply(order -> sendMail(order));
		
		try {
			if(!orderFuture.isCompletedExceptionally()) {
				System.out.println(orderFuture.get().id);
			}
			
		} catch (InterruptedException | ExecutionException e1) {
			e1.printStackTrace();
		}
	
	}
	
	

	private static Order failedOrder() {
		return null; 
	}



	public static Order getOrder() {
		Order order = new Order();
		int id = new Random().nextInt(20);
		System.out.println(id);
		order.id = id;
		return order;
	}
	
	public static Order payment(Order order) {
		if(order.id % 2 != 0) {
			System.out.println("payment failed");
			throw new RuntimeException("Payment failed");
		}
		return order;
	}
	
	public static Order dispatch(Order order) {
		if(order == null) {
			System.out.println("Unable to dispatch order");
			throw new RuntimeException("Dispatch failed");
		}
		
		else if(order.id % 2 != 0) {
			throw new RuntimeException("Dispatch failed");
		}
		return order;
	}
	public static Order sendMail(Order order) {
		if(order == null) {
			System.out.println("Unable to send mail");
			throw new RuntimeException("send mail failed");
		}
		return order;
	}
	
}

class Order{
	int id;
}


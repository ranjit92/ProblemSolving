package problems.common;

public class ConstructorCalling {
	
	class Parent{
		public Parent() {
			System.out.println("From parent");
		}
		
		public void run() {
			walk();
		}
		
		public void walk() {
			System.out.println("From parent walk");
		}
	}
	
	class Child1 extends Parent{
		
		public Child1() {
			System.out.println("From child 1");
		}
		public void run() {
			walk();
		}
		
		public void walk() {
			System.out.println("From parent walk");
		}
		
	}
	
	class Child11 extends Child1{
		
		public Child11() {
			System.out.println("From child 11");
		}
		
		public void run() {
			super.run();
		}
		
		public void walk() {
			super.walk();
		}
		
	}
	
	public static void main(String[] args) {
		ConstructorCalling ob = new ConstructorCalling();
		Child11 cg = ob.new Child11();
		cg.run();
	}

}

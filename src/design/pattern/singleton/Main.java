package design.pattern.singleton;

public class Main {

	public static void main(String[] args) {
		Singleton obj = Singleton.getInstance();
		System.out.println(obj.hashCode());
		Singleton obj1 = Singleton.getInstance();
		System.out.println(obj1.hashCode());
	}
	
}

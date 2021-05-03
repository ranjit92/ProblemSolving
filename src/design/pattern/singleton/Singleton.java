package design.pattern.singleton;

public class Singleton {

	private static Singleton singleton;
	
	private Singleton() {
		
	}
	
	public Singleton getInstance() {
		
		if(singleton == null) {
			synchronized(Singleton.class) {
				if(singleton == null) {
					return new Singleton();
				}
			}
		}
		
		return singleton;
	}
}

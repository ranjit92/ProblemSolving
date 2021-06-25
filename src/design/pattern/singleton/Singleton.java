package design.pattern.singleton;

public class Singleton {

	private static Singleton singleton;

	private Singleton() {

	}

	public static Singleton getInstance() {

		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

	/*
	 * public static synchronized Singleton getInstance2() {
	 * 
	 * if (singleton == null) { singleton = new Singleton(); }
	 * 
	 * return singleton; }
	 */

}

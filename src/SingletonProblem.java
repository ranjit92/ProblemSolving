
public class SingletonProblem {

	private static SingletonProblem instance;
	
	private SingletonProblem() {
		
	}
	
	public static SingletonProblem getInstance() {
		if(instance == null) {
			synchronized (SingletonProblem.class) {
				if(instance == null) {
					instance = new SingletonProblem();
					//return instance;
				}
			}
		}
		return instance;
	}
	
}

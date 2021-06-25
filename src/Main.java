
public class Main {
public static void main(String[] args) {
	SingletonProblem ob = SingletonProblem.getInstance();
	System.out.println(ob);
	SingletonProblem ob1 = SingletonProblem.getInstance();
	System.out.println(ob1);
}
}

import java.util.concurrent.RecursiveTask;

public class ForkJoinExample  {

	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci(6);
		int re = fb.compute();
		System.out.println(re);
	}
}

class Fibonacci extends RecursiveTask<Integer>{
	
	int n;
	Fibonacci(int n){
		this.n = n;
	}
	
	public Integer compute() {
		if(n <= 1) {
			return n;
		}
		Fibonacci f1 = new Fibonacci(n-1);
		f1.fork();
		Fibonacci f2 = new Fibonacci(n-2);
		f2.fork();
		
		return f1.join() + f2.join();
	}
}

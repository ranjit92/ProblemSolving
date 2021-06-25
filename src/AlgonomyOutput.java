import java.util.ArrayList;
import java.util.List;

public class AlgonomyOutput {

	 static class TaskRunner {

	    private static int number;
	    private static Boolean ready;

	    private static class Tester extends Thread {

	        @Override
	        public void run() {
	            while (!ready) {
	                Thread.yield();
	            }

	            System.out.println(number);
	        }
	    }

	    public static void main(String[] args) {
	        new Tester().start();
	        number = 42;
	        ready = true;
	        
	        
	    }
	}
	
}

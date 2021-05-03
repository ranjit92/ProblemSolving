import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

	 public static void main(String[] args)
	    {
	        List<Integer> al = new ArrayList<>();
	        al.add(1);
	        al.add(2);
	        al.add(3);
	        al.add(4);
	        al.add(5);
	  
	        Iterator<Integer> itr = al.iterator();
	        while (itr.hasNext()) {
	            if (itr.next() == 2) {
	                // will not throw Exception if using method of iterator
	                itr.remove();
	            }
	        }
	  
	        System.out.println(al);
	  
	        itr = al.iterator();
	        while (itr.hasNext()) {
	            if (itr.next() == 3) {
	                // will throw Exception on
	                // next call of next() method
	                al.remove(3);
	            }
	        }
	    }
}

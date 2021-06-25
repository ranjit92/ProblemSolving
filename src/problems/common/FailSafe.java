package problems.common;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * These iterators make a copy of the internal collection (object array) and
 * iterates over the copied collection. Any structural modification done to the
 * iterator affects the copied collection, not original collection. So, original
 * collection remains structurally unchanged.
 * 
 * @author ranjit
 *
 */
public class FailSafe {

	public static void main(String args[]) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(new Integer[] { 1, 3, 5, 8 });
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer no = itr.next();
			System.out.println(no);
			if (no == 8)
				// This will not print,
				// hence it has created separate copy
				list.add(14);
		}
		System.out.println("..........................");
		itr = list.iterator();
		while (itr.hasNext()) {
			Integer no = itr.next();
			System.out.println(no);

		}

		System.out.println("-------------------------");
		callConcurrentMap();
	}

	private static void callConcurrentMap() {
		
		Map<Integer, Integer> map = new ConcurrentHashMap<>();
		map.put(1, 0);
		map.put(2, 1);
		map.put(3, 2);
		
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			int i = it.next();
			System.out.println(i);
			if(i == 2)
				map.put(4, 3); // ConcurrentHashMap dosent work on copy thats why we can see that 4 is getting printed here
			
		}
		
	}
	
	
	
}

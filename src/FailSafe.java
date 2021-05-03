import java.util.Iterator;
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

	}
}

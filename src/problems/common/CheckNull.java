package problems.common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class CheckNull {

	public static void main(String[] args) {
		//call(null);
		int i=0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(i++, 0);
//		map.put("key1", 300);
//		map.put("key2", 100);
//		map.put("key3", 300);
//		map.put("key4", 400);
//		map.put("key2", 500);
//		map.put(null, 100);

		System.out.println(map);
		Set<Integer> set = new LinkedHashSet<>();
		set.add(90);
		set.add(78);
		set.add(8);
		set.add(98);

		int a = set.iterator().next();
		System.out.println("Set element: " + a);

	}

	public static void call(Object o) {
		System.out.println("Object method");
	}

	public static void call(String s) {
		System.out.println("String method");
	}

	public static void call(Integer t) {
		System.out.println("Integer method");
	}
}

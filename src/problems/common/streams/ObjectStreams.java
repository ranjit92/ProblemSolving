package problems.common.streams;

import java.util.*;
import java.util.stream.Collectors;

public class ObjectStreams {

	public static void main(String[] args) {
		
		List<Employee> list = getInit();
		
		Map<String, Integer> map = getInit2();
		
		map.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue))
						.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)-> e1, LinkedHashMap::new));
		
		
		Collections.sort(list, (e1, e2) -> e2.salary - e1.salary);
		
		list.forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		
		
		List<String> result = list.stream()
				.sorted((e1,e2) -> e2.salary - e1.salary)
				.filter(e -> e.isActive)
				.limit(3)
				.map(m -> m.name)
				.collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
		System.out.println("-------------------------------------------");
		
		List<Employee> listSorted = list.stream()
				.sorted((e1,e2) -> e1.name.compareTo(e2.name))
				.collect(Collectors.toList());
		listSorted.forEach(e -> System.out.println(e.name));
		
		
		System.out.println("-------------------------------------------");
		
		
		
		
		Map<Integer, Employee> map1 = list.stream().collect(Collectors.toMap(e -> e.id, e -> e));
		
		String names = list.stream().map(m -> m.name).collect(Collectors.joining(", "));
		
		//group by department
		Map<String, List<Employee>> map2 = list.stream()
				.collect(Collectors.groupingBy(e -> e.department));
		
		System.out.println("group by map2: "+map2);
		
		//count of emp in each department
		Map<String, Long> map3 = list.stream()
				.collect(Collectors.groupingBy(e -> e.department, Collectors.counting()));
		System.out.println("group by map3: "+map3);
		
//		List<Student> studentList = new ArrayList<>();
//		Map<Integer, List<Integer>> map = studentList.stream()
//				.collect(Collectors.groupingBy(s -> s.id, Collectors(e -> e.bookid)));
		
	}
	
	public static List<Employee> getInit(){
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("bob",1,40000, true, "CSE"));
		list.add(new Employee("jack", 2,50000, false, "ECE"));
		list.add(new Employee("jeem",4,70000, true, "CSE"));
		list.add(new Employee("Deni",6,80000, true, "EE"));
		return list;
	}
	
	
public static Map<String, Integer> getInit2(){
		
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("a", 3);
		map.put("b", 8);
		map.put("x", 20);
		map.put("g", 5);
		map.put("y", 9);
		map.put("p", 0);
		map.put("j", 1);
		return map;
	}
	
}

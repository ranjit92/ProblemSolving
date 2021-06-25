package problems.common.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreams {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 3, 7, 8, 5, 8, 10, 9, 9, 0, 2, 2, 7 };
		int[] arr1 = new int[] {1,3,4,6,5};
		
		
		int  sumOddSquare = Arrays.stream(arr1).filter(a -> (a % 2) != 0).map(a -> a*a).sum();
		System.out.println("sumOddSquare: " + sumOddSquare);
		
		
		
		int minnum = IntStream.of(arr).min().getAsInt();
		// or
		IntStream.of(arr).min().ifPresent(min -> System.out.println(min));
		// or
		IntStream.of(arr).min().ifPresent(System.out::println);

		// or get All at once
		IntSummaryStatistics summary = IntStream.of(arr).summaryStatistics();

		System.out.println();
		System.out.println(summary.getMax());
		System.out.println(summary.getMin());
		System.out.println(summary.getCount());
		System.out.println(summary.getAverage());
		System.out.println(summary.getSum());

		// get the 1st 3 distinct smallest element

		List<Integer> list = IntStream.of(arr)
				.distinct()
				.sorted()
				.limit(3)
				.boxed()
				.collect(Collectors.toList());
		
		System.out.println("-------------------");
		IntStream.of(arr).filter(ele -> ele % 2 == 0).forEach(System.out::println);
		System.out.println("-------------------");
		IntStream.of(arr).map(n -> n*2).forEach(System.out::println);
		
		boolean b = IntStream.of(arr).anyMatch(n -> n > 0);
		boolean c = IntStream.of(arr).allMatch(n -> n > 0);
		System.out.println(b);
		System.out.println(c);

	}
}

package problems.common.completablefutute;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.IntStream;

/**
 * @author ranjit
 *
 *thenApply, thenAccept these are the callback methods attached to CompletableFuture
 */
public class CFCallBack {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// why this code dosent work all time
		CompletableFuture
			.supplyAsync(() -> IntStream.range(0, 100))
			.thenApply(i -> i.sum())
			.thenAccept(i -> System.out.println());

		// but this works after changing to method referance
		CompletableFuture
			.supplyAsync(() -> IntStream.range(0, 100))
			.thenApply(IntStream::sum)
			.thenAccept(System.out::println);

	}
}

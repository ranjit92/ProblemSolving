
public class Test22 {

	public int countNegatives(int[][] grid) {

		int count = 0;
		for (int i = 0; i < grid.length; i++) {

			int[] arr = grid[i];

			if (arr[0] < 0) {
				count += arr.length;
			}

			else {
				int l = 0;
				int r = arr.length - 1;

				while (l <= r) {
					int mid = l + (r - l) / 2;
					if (arr[mid] < 0) {
						r = mid - 1;
					} else {
						l = mid + 1;
					}
				}
				count += arr.length - l;
			}
		}
		return count;
	}
	
	Runnable r = () -> System.out.println();
}

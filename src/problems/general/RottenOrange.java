package problems.general;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrange {

	public boolean isValidCell(int x, int y, int maxrow, int maxcoll) {

		if (x < 0 || y < 0 || x >= maxrow || y >= maxcoll) {
			return false;
		}
		return true;
	}

	public int orangesRotting(int[][] grid) {

		Queue<int[]> queue = new LinkedList<>();
		int freshCount = 0;
		int min = 0;

		int rowLen = grid.length;
		int collLen = grid[0].length;

		int[] drow = { -1, 0, 1, 0 };
		int[] dcoll = { 0, -1, 0, 1 };

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {

				if (grid[i][j] == 2) {
					queue.add(new int[] { i, j });

				}
				if (grid[i][j] == 1) {
					freshCount++;
				}
			}
		}

		if (freshCount == 0) {
			return 0;
		}

		while (!queue.isEmpty()) {

			int size = queue.size();
			boolean isRotten = false;
			for (int j = 0; j < size; j++) {

				int[] position = queue.poll();

				for (int i = 0; i < 4; i++) {
					int x = position[0] + drow[i];
					int y = position[1] + dcoll[i];

					if (isValidCell(x, y, rowLen, collLen)) {
						if (grid[x][y] == 1) {
							queue.add(new int[] { x, y });
							grid[x][y] = 2;
							isRotten = true;
							freshCount--;
						}

					}
				}
			}

			if (isRotten)
				min++;
		}

		return freshCount == 0 ? min : -1;
	}
}
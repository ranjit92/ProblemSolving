package problems.general;

import java.util.LinkedList;
import java.util.Queue;

public class BFS2DArray {
	
	
	
	public static void main(String[] args) {
		int [][] matrix = {{1, 2, 3, 4}, {5,6,7,8}, {9,10,11,12}, {13, 14, 15, 16}};
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		BFS(matrix, visited, 0, 0);
		
	}
	
	

	static class Pair {
		int row;
		int coll;

		public Pair(int row, int coll) {
			this.row = row;
			this.coll = coll;
		}
	}

	static int[] drow = { 0, 1, 0, -1 };
	static int[] dcoll = { 1, 0, -1, 0 };

	public static boolean isValidCell(boolean[][] visited, int row, int coll, int maxRow, int maxColl) {
		if (row < 0 || coll < 0 || row >= maxRow || coll >= maxColl) {
			return false;
		} else if (visited[row][coll]) {
			return false;
		}
		return true;
	}

	public static void BFS(int[][] grid, boolean[][] visited, int row, int coll) {

		int gridRow = grid.length;
		int gridColl = grid[0].length;

		Queue<Pair> queue = new LinkedList<>();

		queue.add(new Pair(row, coll));
		visited[row][coll] = true;

		while (!queue.isEmpty()) {

			Pair pair = queue.poll();
			int x = pair.row;
			int y = pair.coll;

			System.out.print(grid[x][y] + " ");

			// Go to the 4 adjacent cells
			for (int i = 0; i < 4; i++) {
				int adjx = x + drow[i];
				int adjy = y + dcoll[i];

				if (isValidCell(visited, adjx, adjy, gridRow, gridColl)) {
					queue.add(new Pair(adjx, adjy));
					visited[adjx][adjy] = true;
				}
			}

		}

	}

}

package offer;

/**
 * 机器人运动范围 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月30日上午10:51:59
 */
public class Solution65 {
	int count = 0;

	public int movingCount(int threshold, int rows, int cols) {
		int[] visited = new int[rows * cols];
		calculate(threshold, 0, 0, rows, cols, visited);
		return count;
	}

	public void calculate(int threshold, int i, int j, int rows, int cols,
			int[] visited) {
		count++;
		if (canMove(threshold, i, j, rows, cols, visited)) {
			visited[i * cols + j] = 1;
			calculate(threshold, i + 1, j, rows, cols, visited);
			calculate(threshold, i - 1, j, rows, cols, visited);
			calculate(threshold, i, j + 1, rows, cols, visited);
			calculate(threshold, i, j - 1, rows, cols, visited);
		} else {
			count--;
			//visited[i * cols + j] = 0;
		}
	}

	public boolean canMove(int threshold, int i, int j, int rows, int cols,
			int[] visited) {
		if (i < rows && i >= 0 && j < cols && j >= 0
				&& (i / 10 + i % 10 + j / 10 + j % 10) <= threshold
				&& visited[i * cols + j] == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Solution65 solution65 = new Solution65();
		System.out.println(solution65.movingCount(5, 10, 10));
	}
}

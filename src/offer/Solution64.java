package offer;

public class Solution64 {
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		int[] visited = new int[rows * cols];// 1������ʹ���0����û���߹�
		int pos = 0;// ��¼str·����
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (hasPath(matrix, rows, cols, i, j, visited, str, pos)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean hasPath(char[] matrix, int rows, int cols, int i, int j,
			int[] visited, char[] str, int pos) {
		boolean contain = false;
		if(i<rows&&i>=0&&j<cols&&j>=0&&visited[i*cols+j]==0&&matrix[i*cols+j]==str[pos]){
			pos++;
			visited[i*cols+j]=1;
			if(pos==str.length){
				return true;//·�����һ����
			}
			contain = hasPath(matrix, rows, cols, i+1, j, visited, str, pos)||
					hasPath(matrix, rows, cols, i-1, j, visited, str, pos)||
					hasPath(matrix, rows, cols, i, j+1, visited, str, pos)||
					hasPath(matrix, rows, cols, i, j-1, visited, str, pos);
			if(contain==false){
				pos--;
				visited[i*cols+j]=0;
			}
		}
		return contain;
	}
}

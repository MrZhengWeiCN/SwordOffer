package offer;

import java.util.ArrayList;

/**
 * 按照顺时针打印数列
* Title:
* Description: 
* Company: 
* @author 郑伟
* @date 2017年10月25日下午4:17:59
 */
public class Solution18 {

	public ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> list = new ArrayList<>();
		int rows = matrix.length;
		if(rows==0){return list;}
		int cols = matrix[0].length;
		if(cols==0){return list;}
		int layer = (Math.min(rows, cols)+1)/2;
		for (int n = 1; n<=layer; n++) {
			//左到右
			for(int j=n-1;j<=cols-n;j++){
				list.add(matrix[n-1][j]);
			}
			for (int i = n; i <= rows-n; i++) {
				list.add(matrix[i][cols-n]);
			}
			for (int j = cols-n-1; j >=n-1&&n-1!=rows-n; j--) {
				list.add(matrix[rows-n][j]);
			}
			for (int i = rows-n-1; i >= n&&n-1!=cols-n; i--) {
				list.add(matrix[i][n-1]);
			}
		}
		return list;
    }
	
	public static void main(String[] args){
		Solution18 solution18 = new Solution18();
		int[][] max = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		ArrayList<Integer> list = solution18.printMatrix(max);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}

package offer;

public class Solution1 {

	public boolean Find(int target, int[][] array) {

		boolean find = false;
		int rows = array.length;
		int cols = array[0].length;
		int i = rows-1;
		int j = 0;
		while(!find &&i>=0&&i<rows&&j>=0&&j<cols){
			if(array[i][j]==target){
				find = true;
			}else if (target>array[i][j]) {
				j++;
			}else if (target<array[i][j]) {
				i--;
			}
		}
		return find;
	}
	
	public static void main(String[] args){
		Solution1 solution1 = new Solution1();
		int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		System.out.println(solution1.Find(16, array));
	}
}

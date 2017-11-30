package offer;

import java.util.ArrayList;

/**
 * 和为s的连续正整数序列 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月26日下午8:02:24
 */
public class Solution40 {

	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> resArrayList = new ArrayList<>();
		int max_Num = (int) ((1 + Math.sqrt(1 + 8 * sum)) / 2);// 最大可能的序列
		for (int n = max_Num; n > 1; n--) {
			ArrayList<Integer> temArrayList = new ArrayList<>();
			// a1必须是正整
			if ((2 * sum + n - n * n) / (2 * n) > 0
					&& (2 * sum + n - n * n) % (2 * n) == 0) {
				int a1 = (2 * sum + n - n * n) / (2 * n);
				for (int i = 0; i < n; i++)
					temArrayList.add(a1++);
				resArrayList.add(temArrayList);
			}
		}
		return resArrayList;
	}
	public static void main(String[] args){
		Solution40 s = new Solution40();
		s.FindContinuousSequence(100);
	}
}

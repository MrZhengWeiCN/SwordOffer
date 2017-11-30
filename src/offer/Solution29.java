package offer;

/**
 * 连续子序列的最大和 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月26日上午11:44:10
 */
public class Solution29 {

	public int FindGreatestSumOfSubArray(int[] array) {
		int max = array[0];
		int thisSum = 0;
		for (int i = 0; i < array.length; i++) {
			thisSum += array[i];
			if (thisSum > max)
				max = thisSum;
			if (thisSum < 0)
				thisSum = 0;
		}
		return max;
	}
}

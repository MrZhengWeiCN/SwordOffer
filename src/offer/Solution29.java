package offer;

/**
 * ���������е����� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��26������11:44:10
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

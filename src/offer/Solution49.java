package offer;

/**
 * 找出数组中重复的数组 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月27日上午11:38:50
 */
public class Solution49 {
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++) {
			if(a[numbers[i]]==1){
				duplication[0] = numbers[i];
				return true;
			}else 
				a[numbers[i]] = 1;
		}
		return false;
	}
}

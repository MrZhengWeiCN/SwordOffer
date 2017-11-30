package offer;

import java.util.ArrayList;

/**
 * 递增数组何为s的两个数 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月26日下午8:19:48
 */
public class Solution41 {

	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int low = 0;
		int high = array.length-1;
		while(low<high){
			if(array[low]+array[high]==sum){
				list.add(array[low]);
				list.add(array[high]);
				break;
			}
			else if(array[low]+array[high]>sum)
				high--;
			else if(array[low]+array[high]<sum)
				low++;
		}
		return list;
	}
}

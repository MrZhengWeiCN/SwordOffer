package offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 数组中出现超过一半的数 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月26日上午10:43:26
 */
public class Solution27 {

	public int MoreThanHalfNum_Solution(int[] array) {
		// 复杂度太大了，不是最优的解
		/*
		 * Arrays.sort(array); //先判断是否存在这个数 int target=0; if(array.length%2==1){
		 * target = array[array.length/2]; }else {
		 * if(array[array.length/2]!=array[(array.length/2)-1]){ return 0; }else
		 * { target=array[array.length/2]; } } int targetNum = 0; //判断个数是否过半 for
		 * (int i = 0; i < array.length; i++) {
		 * if(array[i]==target){targetNum++;} } if(targetNum*2>array.length)
		 * return target; else return 0;
		 */
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (!map.containsKey(array[i]))
				map.put(array[i], 1);
			else {
				map.put(array[i], map.get(array[i])+1);
			}
		}
		int length = array.length;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()*2>length)
				return entry.getKey();
		}
		return 0;
	}
}

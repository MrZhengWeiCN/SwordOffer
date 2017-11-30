package offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * �����г��ֳ���һ����� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��26������10:43:26
 */
public class Solution27 {

	public int MoreThanHalfNum_Solution(int[] array) {
		// ���Ӷ�̫���ˣ��������ŵĽ�
		/*
		 * Arrays.sort(array); //���ж��Ƿ��������� int target=0; if(array.length%2==1){
		 * target = array[array.length/2]; }else {
		 * if(array[array.length/2]!=array[(array.length/2)-1]){ return 0; }else
		 * { target=array[array.length/2]; } } int targetNum = 0; //�жϸ����Ƿ���� for
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

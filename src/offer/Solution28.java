package offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 最小的K个数 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月26日上午11:23:16
 */
public class Solution28 {

	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		PriorityQueue<Integer> heap = new PriorityQueue<>(10,
				new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {

						return o2 - o1;
					}
				});
		for (int i = 0; i < k; i++) {
			heap.offer(input[i]);
		}
		for (int i = k; i < input.length; i++) {
			if(heap.peek()>input[i]){
				heap.poll();
				heap.offer(input[i]);
			}
		}
		ArrayList<Integer> result = new ArrayList<>();
		for (Integer integer : heap) {
			result.add(integer);
		}
		return result;
	}
	
	public static void main(String[] args){
		Solution28 s28 = new Solution28();
		int[] input = {4,5,1,6,2,7,3,8};
		for (int i : GetLeastNumbers_Solution(input, 4)) {
			System.out.println(i);
		}
	}
}

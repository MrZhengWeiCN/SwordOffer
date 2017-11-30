package offer;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 数据流中位数 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月29日下午9:49:30
 */
public class Solution62 {
	private int count = 0;
	Queue<Integer> minHeap = new PriorityQueue<>();
	Queue<Integer> maxHeap = new PriorityQueue<>(10, new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2-01;
		}
	});
	
	public void Insert(Integer num) {
		if(count % 2==0){
			minHeap.offer(num);
			Integer integer = minHeap.poll();
			maxHeap.offer(integer);
		}else {
			maxHeap.offer(num);
			Integer poll = maxHeap.poll();
			minHeap.offer(poll);
		}
		count++;
	}

	public Double GetMedian() {
		if (count %2 == 0) {
	        return new Double((minHeap.peek() + maxHeap.peek())) / 2;
	    } else {
	    	return new Double(maxHeap.peek());
	    }
	}
	public void insert1(){
		for (int i = 0; i < 10; i++) {
			synchronized (minHeap) {
				minHeap.offer(i);
			}
		}
		for (int i = 0; i < 10; i++) {
			synchronized(minHeap){
				System.out.println(minHeap.poll());
				
			}
		}
	}
	
	public static void main(String[] args) {
		Solution62 solution62 = new Solution62();
		solution62.Insert(5);
		solution62.Insert(2);
		solution62.Insert(3);
		solution62.Insert(4);
		solution62.Insert(1);
		solution62.Insert(6);
		solution62.Insert(7);
		solution62.Insert(0);
		solution62.Insert(8);
		//solution62.Insert(9);
		//System.out.println(solution62.GetMedian());
		solution62.insert1();
	}
}

package offer;

import java.util.ArrayList;

/**
 * 滑动窗口最大值 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月29日下午10:29:59
 */
public class Solution63 {

	ArrayList<Integer> list = new ArrayList<>();
	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		if(size==0)
			return list;
		int length = num.length;
		int maxIndex = 0;
		for (int i = size - 1; i < length; i++) {
			if (i == size - 1)
				maxIndex = maxIndex(num, i, size);
			// 最大值没有过期
			if (i - maxIndex < size) {
				if (num[i] >= num[maxIndex])
					maxIndex = i;
				list.add(num[maxIndex]);
			} else {
				// 最大植过期了
				maxIndex = maxIndex(num, i, size);
				list.add(num[maxIndex]);
			}
		}
		return list;
	}

	public int maxIndex(int[] num, int pos, int size) {
		int max = 0;
		int maxIndex = 0;
		for (int i = pos - size + 1; i <= pos; i++) {
			if (num[i] >= max) {
				max = num[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static void main(String[] args) {
		Solution63 solution63 = new Solution63();
		int[] num = { 2, 3, 4, 2, 6, 2, 5, 1 };
		ArrayList<Integer> arrayList = solution63.maxInWindows(num, 3);
		for (Integer integer : arrayList) {
			System.out.print(integer);
		}
	}
}

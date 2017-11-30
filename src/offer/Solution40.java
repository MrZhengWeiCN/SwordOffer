package offer;

import java.util.ArrayList;

/**
 * ��Ϊs���������������� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��26������8:02:24
 */
public class Solution40 {

	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> resArrayList = new ArrayList<>();
		int max_Num = (int) ((1 + Math.sqrt(1 + 8 * sum)) / 2);// �����ܵ�����
		for (int n = max_Num; n > 1; n--) {
			ArrayList<Integer> temArrayList = new ArrayList<>();
			// a1����������
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

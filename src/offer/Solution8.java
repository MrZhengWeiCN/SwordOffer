package offer;

/**
 * ��̨������ Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��25������9:44:13
 */
public class Solution8 {

	public int JumpFloor(int target) {
		if(target<3){return target;}
		int last = 2;
		int lastNext = 1;
		int num = 0;
		for (int i = 3; i <=target; i++) {
			num = last+lastNext;
			lastNext = last;
			last = num;
		}
		return num;
	}
}

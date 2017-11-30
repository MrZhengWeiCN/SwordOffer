package offer;

/**
 * 跳台阶问题 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月25日上午9:44:13
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

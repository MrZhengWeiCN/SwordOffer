package offer;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月25日上午10:37:44
 */
public class Solution11 {

	public int NumberOf1(int n) {
		int count = 0;
		while (n!=0) {
			n = n&(n-1);
			count++;
		}
		return count;
	}
}

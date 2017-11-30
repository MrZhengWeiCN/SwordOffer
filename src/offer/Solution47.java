package offer;

/**
 * 不用加减做加法 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月27日上午10:39:03
 */
public class Solution47 {

	public int Add(int num1, int num2) {
		while(num2!=0){
			int temp = num1;
			num1 = num1^num2;
			num2 = (temp&num2)<<1;
		}
		return num1;
	}
}

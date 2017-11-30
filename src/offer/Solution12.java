package offer;

/**
 * 数值的整数次方 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月25日上午10:44:29
 */
public class Solution12 {

	public double Power(double base, int exponent) {
		if(exponent==0){return 1;}
		double result = 1;
		if(exponent>0){
			for (int i = 0; i < exponent; i++) {
				result *= base;
			}
			return result;
		}
		if(exponent<0){
			for (int i = 0; i < Math.abs(exponent); i++) {
				result *= base;
			}
			result =  1.0/result;
			return result;
		}
		return result;
	}
}

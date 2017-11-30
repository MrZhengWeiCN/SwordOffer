package offer;

/**
 * 矩形覆盖
* Title:
* Description: 
* Company: 
* @author 郑伟
* @date 2017年10月25日上午10:21:19
 */
public class Solution10 {

	public int RectCover(int target){
		if(target<=2){return target;}
		int[] a = new int[target];
		a[0]=1;
		a[1]=2;
		for (int i = 2; i < target; i++) {
			a[i] = a[i-1]+a[i-2];
		}
		return a[target-1];
	}
}

package offer;

/**
 * ���θ���
* Title:
* Description: 
* Company: 
* @author ֣ΰ
* @date 2017��10��25������10:21:19
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

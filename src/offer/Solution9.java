package offer;

/**
 * 跳台阶问题2 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月25日上午9:57:28
 */
public class Solution9 {

	public int JumpFloorII(int target) {
		/*if(target<3){return target;}
		int[] a = new int[target];
		a[0] = 1;
		a[1] = 2;
		for (int i = 2; i < target; i++) {
			a[i] = sum(a,i-1)+1;
		}
		return a[target-1];*/
		return (int) Math.pow(2, target-1);
	}

	//数列前i项和
	private int sum(int[] a, int i) {
		int sum = 0;
		for(int x=0;x<=i;x++){
			sum +=a[x];
		}
		return sum;
	}
}

package offer;

/**
 * 圆圈剩下的书 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月26日下午10:16:42
 */
public class Solution45 {

	public int LastRemaining_Solution(int n, int m) {
		int[] a = new int[n];
		int i = -1;
		int step=0;
		int count=n;//剩下的人数
		while (count>0) {
			i++;//下一个人的编号
			if(i>=n)
				i=0;
			if(a[i]==-1)
				continue;//此人已经不在了，跳到下一个
			step++;
			if(step==m){//到达以后，step清零，人数减1，设为-1.
				a[i]=-1;
				step=0;
				count--;
			}
		}
		return i;
	}
}

package offer;

/**
 * ԲȦʣ�µ��� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��26������10:16:42
 */
public class Solution45 {

	public int LastRemaining_Solution(int n, int m) {
		int[] a = new int[n];
		int i = -1;
		int step=0;
		int count=n;//ʣ�µ�����
		while (count>0) {
			i++;//��һ���˵ı��
			if(i>=n)
				i=0;
			if(a[i]==-1)
				continue;//�����Ѿ������ˣ�������һ��
			step++;
			if(step==m){//�����Ժ�step���㣬������1����Ϊ-1.
				a[i]=-1;
				step=0;
				count--;
			}
		}
		return i;
	}
}

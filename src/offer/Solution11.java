package offer;

/**
 * ����һ��������������������Ʊ�ʾ��1�ĸ����� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��25������10:37:44
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

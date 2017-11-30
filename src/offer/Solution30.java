package offer;

public class Solution30 {
	public int NumberOf1Between1AndN_Solution(int n) {
		int num = 0;
		for (int i = 1; i <= n; i++) {
			String string = String.valueOf(i);
			char[] charArray = string.toCharArray();
			for (int j = 0; j < charArray.length; j++) {
				if(charArray[j]=='1')
					num++;
			}
		}
		return num;
	}
}

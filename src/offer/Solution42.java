package offer;

/**
 * 循环移动字符串字符 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月26日下午8:38:29
 */
public class Solution42 {

	public String LeftRotateString(String str, int n) {
		if(str==null||str.length()==0){
			return "";
		}
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		int realMove = n % length;
		int newPos = 0;
		char[] res = new char[length];
		for (int i = 0; i < charArray.length; i++) {
			newPos = i - realMove < 0 ? i - realMove + length : i - realMove;
			res[newPos] = charArray[i];
		}
		StringBuffer sb = new StringBuffer();
		for (char c : res) {
			sb.append(c);
		}
		return sb.toString();
	}
}

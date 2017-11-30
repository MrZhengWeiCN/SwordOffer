package offer;

/**
 * 字符替换 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月24日下午8:26:12
 */
public class Solution2 {

	public String replaceSpace(StringBuffer str) {
		if(str.length()==0){
			return str.toString();
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)== ' '){
				sb.append('%');
				sb.append('2');
				sb.append('0');
			}else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
}

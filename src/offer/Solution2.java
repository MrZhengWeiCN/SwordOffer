package offer;

/**
 * �ַ��滻 Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��24������8:26:12
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

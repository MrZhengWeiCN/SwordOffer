package offer;

/**
 * ��ת����˳�� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��26������8:47:39
 */
public class Solution43 {
	public String ReverseSentence(String str) {
		if (str == null) {
			return null;
		}
		if (str.trim().equals("")) {
			return str;
		}
		String[] split = str.split(" ");
		StringBuffer sbBuffer = new StringBuffer("");
		for (int i = split.length - 1; i >= 0; i--) {
			sbBuffer.append(split[i]);
			if (i != 0)
				sbBuffer.append(" ");
		}
		String re = sbBuffer.toString();
		return sbBuffer.toString();
	}

	public static void main(String[] args) {
		Solution43 solution43 = new Solution43();
		String string = "            ";
		System.out.println(solution43.ReverseSentence(string));
		System.out.println(string);
	}
}

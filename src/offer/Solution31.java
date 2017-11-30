package offer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * �����ų���С Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��26������2:07:26
 */
public class Solution31 {

	public String PrintMinNumber(int[] numbers) {
		if(numbers==null||numbers.length==0)
			return "";
		StringBuffer stringBuffer = new StringBuffer();
		String[] str = new String[numbers.length];
		for (int i = 0; i < str.length; i++) {
			str[i] = String.valueOf(numbers[i]);
		}
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String s1 = o1+o2;
				String s2 = o2+o1;
				//>0,o2o1:<0,o1o2
				return s1.compareTo(s2);
			}
		});
		for (String string : str) {
			stringBuffer.append(string);
		}
		return stringBuffer.toString();
	}
}

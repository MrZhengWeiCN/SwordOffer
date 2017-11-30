package offer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * �ַ����е�һ�����ظ����ַ� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��27������5:21:50
 */
public class Solution53 {
	Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	public void Insert(char ch) {
		if(map.containsKey(ch))
			map.put(ch, 2);
		else 
			map.put(ch, 1);
	}

	public char FirstAppearingOnce() {
		for (Map.Entry<Character, Integer> map2 : map.entrySet()) {
			if(map2.getValue()==1)
				return map2.getKey();
		}
		return '#';
	}
}

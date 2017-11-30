package offer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 字符流中第一个不重复的字符 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月27日下午5:21:50
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

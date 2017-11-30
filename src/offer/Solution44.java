package offer;

import java.util.Arrays;

/**
 * �������� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��26������9:28:20
 */
public class Solution44 {
	public boolean isContinuous(int[] numbers) {
		if (numbers == null || numbers.length != 5)
			return false;
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] != 0) {
				if (numbers[numbers.length - 1] - numbers[i] > 4)
					return false;
				if (numbers[i] == numbers[i + 1])
					return false;
			}
		}
		return true;
	}
}

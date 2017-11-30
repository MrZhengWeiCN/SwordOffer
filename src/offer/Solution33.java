package offer;

public class Solution33 {

	public int FirstNotRepeatingChar(String str) {
		int[] array = new int[256];
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			array[charArray[i]]++;
		}
		for (int i = 0; i < charArray.length; i++) {
			if(array[charArray[i]]==1)
				return i;
		}
		return -1;
	}
}

package offer;

/**
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分， Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月25日上午11:04:19
 */
public class Solution13 {

	public void reOrderArray(int[] array) {
		int oddNum = 0;//奇数
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==1){
				oddNum++;
			}
		}
		int oddStart = 0;
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==1){
				newArray[oddStart++]=array[i];
			}else {
				newArray[oddNum++] = array[i];
			}
		}
		for (int i = 0; i < newArray.length; i++) {
			array[i] = newArray[i];
		}
	}
}

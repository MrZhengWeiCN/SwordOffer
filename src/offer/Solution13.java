package offer;

/**
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ������ĺ�벿�֣� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��25������11:04:19
 */
public class Solution13 {

	public void reOrderArray(int[] array) {
		int oddNum = 0;//����
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

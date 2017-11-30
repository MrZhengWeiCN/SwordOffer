package offer;

public class Solution6 {

	public int minNumberInRotateArray(int[] array) {
		if (array.length == 0) {
			return 0;
		}
		/*//¸´ÔÓ¶ÈÌ«´ó
		for (int i = 0; i < array.length-1; i++) {
			if(array[i]>array[i+1]){
				return array[i+1];
			}
		}
		return 0;*/
		int low = 0;
		int high = array.length-1;
		int mid = 0;
		int target = 0;
		while (low<high) {
			if(high-low==1){
				target = Math.min(array[low], array[high]);
				break;
			}
			mid = (low+high)/2;
			if(array[mid]>=array[high]){
				low = mid;
			}if(array[mid]<array[low]){
				high = mid;
			}
		}
		return target;
	}
}

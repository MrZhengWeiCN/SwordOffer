package offer;

public class Solution36 {

	public int GetNumberOfK(int[] array, int k) {
		if(array==null||array.length==0||array[0]>k||array[array.length-1]<k)
			return 0 ;
		if (array.length == 1)
			return array[0] == k ? 1 : 0;
		int first = getFirst(array, k);
		int last = getLast(array, k);
		if(first==0&&last==0)
			return 0;
		return last - first+1;
	}

	private int getLast(int[] array, int k) {
		int low = 0;
		int high = array.length - 1;
		int mid = 0;
		while(low<=high){
			mid = (low+high)/2;
			if(mid==array.length-1)
				return mid;
			if(array[mid]>k)
				high = mid-1;
			else if(array[mid]<k)
				low = mid+1;
			//mid为k，再判断一下mid左边是否为k，如果不是则直接输出
			else if(array[mid+1]!=k)
				return mid;
			else if(array[mid+1]==k)
				low = mid+1;
		}
		return 0;
	}

	private int getFirst(int[] array, int k) {
		int low = 0;
		int high = array.length - 1;
		int mid = 0;
		while(low<=high){
			mid = (low+high)/2;
			if(mid==0)
				return mid;
			if(array[mid]>k)
				high = mid-1;
			else if(array[mid]<k)
				low = mid+1;
			//如果mid为k，判断mid-1是否为k，如果不是的话就直接返回
			else if(array[mid-1]!=k)
				return mid;
			else if(array[mid-1]==k)
				high = mid-1;
		}
		return 0;
	}
	
	public static void main(String[] args){
		Solution36 solution36 = new Solution36();
		int[] a = {1,2,2,2,3,4,5,6,7};
		System.out.println(solution36.GetNumberOfK(a, 2));
	}
}

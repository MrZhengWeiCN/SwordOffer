package offer;

/**
 * Fibonacci����1,1,2,3,5,8,13����������
* Title:
* Description: 
* Company: 
* @author ֣ΰ
* @date 2017��10��25������9:37:00
 */
public class Solution7 {

	public int Fibonacci(int n) {

		if(n==0){return 0;}
		if(n<=2){return 1;}
		int last = 1;
		int lastNext = 1;
		int target = 0;
		for(int i=2;i<n;i++){
			target = last+lastNext;
			lastNext = last;
			last = target;
		}
		return target;
	}
}

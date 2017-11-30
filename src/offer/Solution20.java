package offer;

import java.util.Stack;

/**
 * 判断是否为出栈顺序 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月25日下午5:38:24
 */
public class Solution20 {

	public static boolean IsPopOrder(int[] pushA, int[] popA) {
		Stack<Integer> stack = new Stack<>();
		int pushPos = 0;
		int popPos = 0;
		int length = pushA.length;
		while (pushPos<length) {
			stack.push(pushA[pushPos]);
			pushPos++;
			while(!stack.isEmpty()&&stack.peek()==popA[popPos]){
				stack.pop();
				popPos++;
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args){
		int[] pushA = {1,2,3,4,5};
		int[] popA = {4,5,3,2,1};
		System.out.println(IsPopOrder(pushA, popA));
	} 
}

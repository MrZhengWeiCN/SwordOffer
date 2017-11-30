package offer;

import java.util.Stack;

/**
 * 两个栈实现一个队列
* Title:
* Description: 
* Company: 
* @author 郑伟
* @date 2017年10月24日下午9:17:29
 */
public class Solution5 {

	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack2.add(node);//用来存储数据
    }
    
    public int pop() {
    	if(stack1.isEmpty()){
    		while(!stack2.isEmpty()){
    			stack1.add(stack2.pop());//stack2放入stack1中去
    		}
    	}
    	return stack1.pop();
    }
}

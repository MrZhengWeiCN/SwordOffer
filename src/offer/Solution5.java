package offer;

import java.util.Stack;

/**
 * ����ջʵ��һ������
* Title:
* Description: 
* Company: 
* @author ֣ΰ
* @date 2017��10��24������9:17:29
 */
public class Solution5 {

	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack2.add(node);//�����洢����
    }
    
    public int pop() {
    	if(stack1.isEmpty()){
    		while(!stack2.isEmpty()){
    			stack1.add(stack2.pop());//stack2����stack1��ȥ
    		}
    	}
    	return stack1.pop();
    }
}

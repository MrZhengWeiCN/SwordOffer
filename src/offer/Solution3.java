package offer;

import java.util.ArrayList;

import BinaryTree.ListNode;

/**
 * ��β��ͷ��ӡ����ÿ���ڵ��ֵ Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��24������8:50:17
 */
public class Solution3 {

	ArrayList<Integer> list = new ArrayList<Integer>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		if(listNode!=null){
			this.printListFromTailToHead(listNode.next);
			list.add(listNode.val);
		}
		return list;
	}
}

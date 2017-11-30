package offer;

import java.util.ArrayList;

import BinaryTree.ListNode;

/**
 * 从尾到头打印链表每个节点的值 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月24日下午8:50:17
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

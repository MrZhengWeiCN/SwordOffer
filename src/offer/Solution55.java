package offer;

import BinaryTree.ListNode;

/**
 * 删除链表中重复的节点 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月27日下午7:34:05
 */
public class Solution55 {
	public ListNode deleteDuplication(ListNode pHead) {
		ListNode first = new ListNode(-1);//设立一个额外头节点
		first.next = pHead;
		ListNode preNode = first;
		ListNode currentNode = pHead;
		while (currentNode!=null&&currentNode.next!=null) {
			if(currentNode.val == currentNode.next.val){
				int sameVal = currentNode.val;
				while(currentNode!=null&&currentNode.val==sameVal){
					currentNode =currentNode.next;
				}
				//1,2,3,3,4,4,5,6，6
				//2跳过3直接和4想连
				//又因为4后面也是为4，currentNode定位到5
				preNode.next = currentNode;
				//只要是有重复的，preNode不会动，动的是currentNode
			}else {
				//因为5后面是6，所以preNode=5，currentNode=6
				//只有不重复的时候，preNode才会动
				preNode = currentNode;
				currentNode = currentNode.next;
			}
		}
		return first.next;
	}
}

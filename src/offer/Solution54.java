package offer;

import BinaryTree.ListNode;

/**
 * 链表中环的入口点 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月27日下午5:37:55
 */
public class Solution54 {
	public static ListNode EntryNodeOfLoop(ListNode pHead) {
		if (pHead == null || pHead.next == null)
			return null;
		ListNode m1 = pHead.next;
		ListNode m2 = pHead.next.next;
		while(m1!=m2){
			m1 = m1.next;
			m2 = m2.next.next;
		}
		m2 = pHead;
		while (m1!=m2) {
			m1 = m1.next;
			m2 = m2.next;
		}
		return m1;
	}
	
	public static void main(String[] args){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n3;
		System.out.println(EntryNodeOfLoop(n1).val);
	}
}

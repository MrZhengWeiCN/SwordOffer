package offer;

import BinaryTree.ListNode;

/**
 * 两个链表的公共节点 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月26日下午3:59:11
 */
public class Solution35 {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ListNode p1 = pHead1;
		ListNode p2 = pHead2;
		while (p1!=p2) {
			p1=(p1==null?pHead2:p1.next);
			p2=(p2==null?pHead1:p2.next);
		}
		return p1;
		/* ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        boolean find = false;
        ListNode res = null;
        while (!find) {
            if (p1 == p2){
                res = p1;
                find = true;
            }
            else {
               p1=(p1==null?pHead2:p1.next);
			   p2=(p2==null?pHead1:p2.next);
            }
        }
        return res;
		 */
	}
}

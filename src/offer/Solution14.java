package offer;

import BinaryTree.ListNode;

/**
 * ���������k���ڵ�
* Title:
* Description: 
* Company: 
* @author ֣ΰ
* @date 2017��10��25������11:18:31
 */
public class Solution14 {

	int count=0;
	ListNode res = null;
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head!=null){
			FindKthToTail(head.next,k);
			count++;
			if(count==k){res = head;}
		}
		return res;
    }
}

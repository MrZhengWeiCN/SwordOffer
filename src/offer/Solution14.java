package offer;

import BinaryTree.ListNode;

/**
 * 输出倒数第k个节点
* Title:
* Description: 
* Company: 
* @author 郑伟
* @date 2017年10月25日上午11:18:31
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

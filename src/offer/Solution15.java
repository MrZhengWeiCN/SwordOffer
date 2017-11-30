package offer;

import BinaryTree.ListNode;

/**
 * 合并排序的列表 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月25日上午11:41:26
 */
public class Solution15 {

	public ListNode Merge(ListNode list1, ListNode list2) {
		//非递归版本
		if(list1==null){return list2;}
		if (list2==null) {
			return list1;
		}
		ListNode head = null;
		ListNode curNode = null;
		while (list1!=null&&list2!=null) {
			if(list1.val<=list2.val){
				if(head==null){//记录头节点
					head=list1;
					curNode=list1;
				}else {
					curNode.next = list1;//当前节点下一位是比较小的一个
					curNode = curNode.next;//当前节点往后移动一位
				}
				list1 = list1.next;//小的值往后移动一位
			}else {
				if(head==null){
					head = list2;
					curNode = list2;
				}else {
					curNode.next = list2;
					curNode = curNode.next;
				}
				list2 = list2.next;
			}
		}
		if(list1==null){
			curNode.next = list2;
		}else{
			curNode.next = list1;
		}
		return head;
	}
	public static void main(String[] args) {
		Solution15 solution15 = new Solution15();
		ListNode node = new ListNode(1);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(5);
		ListNode node4 = new ListNode(2);
		ListNode node5 = new ListNode(4);
		node.next = node2;
		node2.next = node3;
		node4.next = node5;
		ListNode res = solution15.Merge(node, node4);
		System.out.println(res.val);
	}
}

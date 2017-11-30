package offer;

import BinaryTree.ListNode;

/**
 * �ϲ�������б� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��25������11:41:26
 */
public class Solution15 {

	public ListNode Merge(ListNode list1, ListNode list2) {
		//�ǵݹ�汾
		if(list1==null){return list2;}
		if (list2==null) {
			return list1;
		}
		ListNode head = null;
		ListNode curNode = null;
		while (list1!=null&&list2!=null) {
			if(list1.val<=list2.val){
				if(head==null){//��¼ͷ�ڵ�
					head=list1;
					curNode=list1;
				}else {
					curNode.next = list1;//��ǰ�ڵ���һλ�ǱȽ�С��һ��
					curNode = curNode.next;//��ǰ�ڵ������ƶ�һλ
				}
				list1 = list1.next;//С��ֵ�����ƶ�һλ
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

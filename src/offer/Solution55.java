package offer;

import BinaryTree.ListNode;

/**
 * ɾ���������ظ��Ľڵ� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��27������7:34:05
 */
public class Solution55 {
	public ListNode deleteDuplication(ListNode pHead) {
		ListNode first = new ListNode(-1);//����һ������ͷ�ڵ�
		first.next = pHead;
		ListNode preNode = first;
		ListNode currentNode = pHead;
		while (currentNode!=null&&currentNode.next!=null) {
			if(currentNode.val == currentNode.next.val){
				int sameVal = currentNode.val;
				while(currentNode!=null&&currentNode.val==sameVal){
					currentNode =currentNode.next;
				}
				//1,2,3,3,4,4,5,6��6
				//2����3ֱ�Ӻ�4����
				//����Ϊ4����Ҳ��Ϊ4��currentNode��λ��5
				preNode.next = currentNode;
				//ֻҪ�����ظ��ģ�preNode���ᶯ��������currentNode
			}else {
				//��Ϊ5������6������preNode=5��currentNode=6
				//ֻ�в��ظ���ʱ��preNode�Żᶯ
				preNode = currentNode;
				currentNode = currentNode.next;
			}
		}
		return first.next;
	}
}

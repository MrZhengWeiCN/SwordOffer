package offer;

/**
 * ��������ĸ�ֵ Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��25������10:02:12
 */
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class Solution24 {
	public RandomListNode Clone(RandomListNode pHead) {
		if(pHead==null){
			return null;
		}
		//1.��ӽڵ�A-A'-B-B'
		RandomListNode current = pHead;
		while (current!=null) {
			RandomListNode node = new RandomListNode(current.label);
			node.next = current.next;
			current.next = node;
			current = node.next;
		}
		//2.���random��
		current = pHead;
		while (current!=null) {
			if(current.random!=null){//ֻ��Ҫ���ж���ڵ�Ľڵ����
				current.next.random = current.random.next;
			}
			current = current.next.next;
		}
		//3.���
		RandomListNode copyHead =pHead.next;
		RandomListNode parent = pHead;
		RandomListNode kid = pHead.next;
		while (parent!=null) {
			parent.next = parent.next.next;
			if(kid.next!=null){
				kid.next = kid.next.next;
			}
			kid = kid.next;
			parent = parent.next;
		}
		return copyHead;
	}
}

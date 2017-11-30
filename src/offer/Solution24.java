package offer;

/**
 * 复杂链表的赋值 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月25日下午10:02:12
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
		//1.添加节点A-A'-B-B'
		RandomListNode current = pHead;
		while (current!=null) {
			RandomListNode node = new RandomListNode(current.label);
			node.next = current.next;
			current.next = node;
			current = node.next;
		}
		//2.添加random点
		current = pHead;
		while (current!=null) {
			if(current.random!=null){//只需要对有额外节点的节点操作
				current.next.random = current.random.next;
			}
			current = current.next.next;
		}
		//3.拆分
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

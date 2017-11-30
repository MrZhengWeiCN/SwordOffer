package offer;

/**
 * ����������һ���ڵ� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��27������8:20:08
 */
class TreeLinkNode {
	int val;
	TreeLinkNode left = null;
	TreeLinkNode right = null;
	TreeLinkNode next = null;

	TreeLinkNode(int val) {
		this.val = val;
	}
}

public class Solution56 {
	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		if (pNode == null)
			return null;
		// ������Ҷ��ӣ������Ҷ��������
		TreeLinkNode temp = null;
		if (pNode.right != null) {
			temp = pNode.right;
			while(temp.left!=null)
				temp = temp.left;
			return temp;
		}else {
			while (pNode.next!=null) {
				if(pNode==pNode.next.left)
					return pNode.next;
				else 
					pNode = pNode.next;
			}
		}
		return null;
	}
}

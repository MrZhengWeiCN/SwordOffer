package offer;

/**
 * 二叉树的下一个节点 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月27日下午8:20:08
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
		// 如果有右儿子，返回右儿子最左点
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

package offer;

import BinaryTree.TreeNode;

/**
 * 二叉搜索树与双向遍历 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月26日上午10:27:17
 */
public class Solution25 {

	TreeNode head = null;
	TreeNode preNode = null;
	public TreeNode Convert(TreeNode pRootOfTree) {
		reverse(pRootOfTree);
		return head;
	}
	private void reverse(TreeNode pRootOfTree) {
		//前序遍历
		if(pRootOfTree==null){return;}
		reverse(pRootOfTree.left);
		if(head==null){
			head = pRootOfTree;
		}else{
			//建立双向链表
			preNode.right=pRootOfTree;
			pRootOfTree.left=preNode;
		}
		preNode = pRootOfTree;
		reverse(pRootOfTree.right);
	}
}

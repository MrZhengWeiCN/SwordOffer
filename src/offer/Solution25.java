package offer;

import BinaryTree.TreeNode;

/**
 * ������������˫����� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��26������10:27:17
 */
public class Solution25 {

	TreeNode head = null;
	TreeNode preNode = null;
	public TreeNode Convert(TreeNode pRootOfTree) {
		reverse(pRootOfTree);
		return head;
	}
	private void reverse(TreeNode pRootOfTree) {
		//ǰ�����
		if(pRootOfTree==null){return;}
		reverse(pRootOfTree.left);
		if(head==null){
			head = pRootOfTree;
		}else{
			//����˫������
			preNode.right=pRootOfTree;
			pRootOfTree.left=preNode;
		}
		preNode = pRootOfTree;
		reverse(pRootOfTree.right);
	}
}

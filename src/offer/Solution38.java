package offer;

import BinaryTree.TreeNode;
/**
 * �ж��Ƿ�Ϊƽ�������ο�ǰһ����Ŀ����������ȵķ���
* Title:
* Description: 
* Company: 
* @author ֣ΰ
* @date 2017��10��26������7:16:35
 */
public class Solution38 {

	boolean isBalenced = true;
	public boolean IsBalanced_Solution(TreeNode root) {
		IsBalenced(root);
		return isBalenced;
	}
	public int IsBalenced(TreeNode root){
		if(root==null)
			return 0;
		//��ø߶�
		int left = IsBalenced(root.left);
		int right = IsBalenced(root.right);
		if(Math.abs(left-right) > 1)
			isBalenced = false;
		return Math.max(left, right)+1;
	}
}

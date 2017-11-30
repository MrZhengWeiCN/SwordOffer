package offer;

import BinaryTree.TreeNode;

/**
 * ��������� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��26������5:28:03
 */
public class Solution37 {

	public int TreeDepth(TreeNode root) {
		if(root==null){
			return 0;
		}
		int left = TreeDepth(root.left);
		int right = TreeDepth(root.right);
		return Math.max(left+1, right+1);
	}
}

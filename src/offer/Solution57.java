package offer;

import BinaryTree.TreeNode;
import Practice.CompareThreadPool;

/**
 * 二叉树判断是否对称 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月27日下午8:41:23
 */
public class Solution57 {
	boolean isSymmetrical(TreeNode pRoot) {
		if (pRoot == null)
			return true;
		return isSymmetrical(pRoot.left, pRoot.right);
	}

	private boolean isSymmetrical(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		if (left != null && right != null) {
			if (left.val != right.val)
				return false;
			else
				return isSymmetrical(left.left, right.right)
						&& isSymmetrical(left.right, right.left);
		}
		return false;
	}
}

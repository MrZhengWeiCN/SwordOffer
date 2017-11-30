package offer;

import BinaryTree.TreeNode;
import Practice.CompareThreadPool;

/**
 * �������ж��Ƿ�Գ� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��27������8:41:23
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

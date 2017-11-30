package offer;

import BinaryTree.TreeNode;

/**
 * 求树的深度 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月26日下午5:28:03
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

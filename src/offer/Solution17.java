package offer;

import BinaryTree.TreeNode;

/**
 * 镜像二叉树 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月25日下午3:56:31
 */
public class Solution17 {

	public void Mirror(TreeNode root) {
		if(root==null){return;}
		//第二层开始左右交换
		TreeNode tempNode = root.left;
		root.left = root.right;
		root.right = tempNode;
		//对下一层也是交换
		Mirror(root.left);
		Mirror(root.right);
	}
}

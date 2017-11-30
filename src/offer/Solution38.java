package offer;

import BinaryTree.TreeNode;
/**
 * 判断是否为平衡树，参考前一个题目的求树的深度的方法
* Title:
* Description: 
* Company: 
* @author 郑伟
* @date 2017年10月26日下午7:16:35
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
		//获得高度
		int left = IsBalenced(root.left);
		int right = IsBalenced(root.right);
		if(Math.abs(left-right) > 1)
			isBalenced = false;
		return Math.max(left, right)+1;
	}
}

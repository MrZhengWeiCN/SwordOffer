package offer;

import BinaryTree.TreeNode;

/**
 * 重建二叉樹 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月24日下午8:58:44
 */
public class Solution4 {

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		TreeNode node = reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
		return node;
	}

	public TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre,
			int[] in, int startIn, int endIn) {
		if(startIn>endIn||startPre>endPre){return null;}
		TreeNode node = new TreeNode(pre[startPre]);//第一个就是根节点了
		for (int i = 0; i < in.length; i++) {
			if(pre[startPre]==in[i]){
				node.left = reConstructBinaryTree(pre, startPre+1, startPre+i-startIn, in, startIn, i-1);
				node.right = reConstructBinaryTree(pre, startPre+i-startIn+1, endPre, in, i+1, endIn);
			}
		}
		return node;
	}
}

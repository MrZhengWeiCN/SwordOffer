package offer;

import BinaryTree.TreeNode;

/**
 * 二叉搜索树K大的节点 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月29日下午9:38:04
 */
public class Solution61 {
	int count = 0;
	TreeNode res = null;
	TreeNode KthNode(TreeNode pRoot, int k) {
		if (pRoot == null || k <= 0)
			return null;
		KthNode(pRoot.left, k);
		if (pRoot != null) {
			count++;
		}
		if (count == k){
			res = pRoot;
			return res;
		}
		KthNode(pRoot.right, k);
		return res;
	}

}

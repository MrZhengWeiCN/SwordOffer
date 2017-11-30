package offer;

import BinaryTree.TreeNode;

/**
 * ����������K��Ľڵ� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��29������9:38:04
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

package offer;

import BinaryTree.TreeNode;

/**
 * ��������� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��25������3:56:31
 */
public class Solution17 {

	public void Mirror(TreeNode root) {
		if(root==null){return;}
		//�ڶ��㿪ʼ���ҽ���
		TreeNode tempNode = root.left;
		root.left = root.right;
		root.right = tempNode;
		//����һ��Ҳ�ǽ���
		Mirror(root.left);
		Mirror(root.right);
	}
}

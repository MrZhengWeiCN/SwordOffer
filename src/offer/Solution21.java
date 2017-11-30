package offer;

import java.util.ArrayList;
import java.util.LinkedList;

import BinaryTree.TreeNode;

/**
 * ���Ĳ������ Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��25������5:57:55
 */
public class Solution21 {

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		TreeNode currenTreeNode = null;
		while(!queue.isEmpty()){
			currenTreeNode = queue.poll();
			list.add(currenTreeNode.val);
			if(currenTreeNode.left!=null){queue.offer(currenTreeNode.left);}
			if(currenTreeNode.right!=null){queue.offer(currenTreeNode.right);}
		}
		return list;
	}
}

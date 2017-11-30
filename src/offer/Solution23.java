package offer;

import java.util.ArrayList;

import BinaryTree.TreeNode;

/**
 * 和为某一个值的二叉树路径 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月25日下午9:39:48
 */
public class Solution23 {

	ArrayList<ArrayList<Integer>> aaList = new ArrayList<>();
	ArrayList<Integer> aList = new ArrayList<>();
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

		aList.add(root.val);
		target = target-root.val;
		if(target==0&&root.left==null&&root.right==null){
			aaList.add(new ArrayList<>(aList));
		}
		FindPath(root.left, target);
		FindPath(root.right, target);
		aList.remove(aList.size()-1);//如果叶子节点没找到就往回退到父节点
		return aaList;
	}
}

package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import BinaryTree.TreeNode;

/**
 * 一层一层打印二叉树 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月27日下午9:27:07
 */
public class Solution59 {
	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> aaLis = new ArrayList<>();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		if (pRoot == null) {
			return aaLis;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		int level_Num = 0;// 记录当前点在层的位置
		int level_End = 1;// 记录当前层容量
		boolean right_left = false;
		queue.offer(pRoot);
		while (!queue.isEmpty()) {
			TreeNode poll = queue.poll();
			if (poll.left != null)
				queue.offer(poll.left);
			if (poll.right != null)
				queue.offer(poll.right);
			aList.add(poll.val);
			level_Num++;
			// 一层内容添加完了
			if (level_Num == level_End) {
				// 初始两个参数
				level_End = queue.size();
				level_Num = 0;
				aaLis.add(aList);
				aList = new ArrayList<>();
			}
		}
		return aaLis;
	}
}

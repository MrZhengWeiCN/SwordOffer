package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import BinaryTree.TreeNode;

/**
 * һ��һ���ӡ������ Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��27������9:27:07
 */
public class Solution59 {
	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> aaLis = new ArrayList<>();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		if (pRoot == null) {
			return aaLis;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		int level_Num = 0;// ��¼��ǰ���ڲ��λ��
		int level_End = 1;// ��¼��ǰ������
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
			// һ�������������
			if (level_Num == level_End) {
				// ��ʼ��������
				level_End = queue.size();
				level_Num = 0;
				aaLis.add(aList);
				aList = new ArrayList<>();
			}
		}
		return aaLis;
	}
}

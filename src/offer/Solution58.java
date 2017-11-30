package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import BinaryTree.TreeNode;

/**
 * ֮�ִ�ӡ������ Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��27������9:08:47
 */
public class Solution58 {

	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> aaLis = new ArrayList<>();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		if(pRoot==null){return aaLis;}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		int level_Num = 0;//��¼��ǰ���ڲ��λ��
		int level_End = 1;//��¼��ǰ������
		boolean right_left = false;
		queue.offer(pRoot);
		while (!queue.isEmpty()) {
			TreeNode poll = queue.poll();
			if(poll.left!=null)
				queue.offer(poll.left);
			if(poll.right!=null)
				queue.offer(poll.right);
			aList.add(poll.val);
			level_Num++;
			//һ�������������
			if(level_Num==level_End){
				//��ʼ��������
				level_End = queue.size();
				level_Num = 0;
				if(right_left){
					Collections.reverse(aList);
					aaLis.add(aList);
				}else 
					aaLis.add(aList);
				right_left = !right_left;
				aList = new ArrayList<>();
			}
		}
		return aaLis;
	}
}

package offer;

import java.util.ArrayList;

import BinaryTree.TreeNode;

/**
 * ��Ϊĳһ��ֵ�Ķ�����·�� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��25������9:39:48
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
		aList.remove(aList.size()-1);//���Ҷ�ӽڵ�û�ҵ��������˵����ڵ�
		return aaList;
	}
}

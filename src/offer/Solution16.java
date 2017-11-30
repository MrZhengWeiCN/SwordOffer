package offer;

import BinaryTree.TreeNode;
import Practice.CompareThreadPool;

/**
 * �ж��Ƿ�Ϊ���� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��25������3:29:27
 */
public class Solution16 {

	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		if(root2==null){return false;}//������������һ�������ӽṹ
		boolean have = false;
		if(root1!=null&&root2!=null){
			if(root1.val==root2.val){
				//��ʼ�Ƚ�
				have = compare(root1,root2);
			}
			if(!have){have = compare(root1.left, root2);}
			if(!have){have = compare(root1.right, root2);}
		}
		return have;
	}
	private boolean compare(TreeNode root1, TreeNode root2) {
		if(root1==null&&root2!=null){return false;}
		if(root2==null){return true;}
		if(root1.val!=root2.val){return false;}
		return compare(root1.left, root2.left)&&compare(root1.right, root2.right);
	}
}

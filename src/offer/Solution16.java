package offer;

import BinaryTree.TreeNode;
import Practice.CompareThreadPool;

/**
 * 判断是否为子树 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月25日下午3:29:27
 */
public class Solution16 {

	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		if(root2==null){return false;}//空树不是任意一个树的子结构
		boolean have = false;
		if(root1!=null&&root2!=null){
			if(root1.val==root2.val){
				//开始比较
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

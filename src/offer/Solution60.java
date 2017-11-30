package offer;
import BinaryTree.TreeNode;

/**
 * 序列化反序列化二叉樹 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月27日下午9:36:35
 */
public class Solution60 {
	//前序遍历
	int index = -1;
	String Serialize(TreeNode root) {
		StringBuffer buffer = new StringBuffer();
		if(root==null){
			buffer.append("#,");
			return buffer.toString();
		}
		buffer.append(root.val+",");
		buffer.append(Serialize(root.left));
		buffer.append(Serialize(root.right));
		return buffer.toString();
	}
	TreeNode Deserialize(String str) {
		index++;
		if(index>=str.length())
			return null;
		String[] split = str.split(",");
		TreeNode rootNode = null;
		if(!split[index].equals("#")){
			rootNode = new TreeNode(Integer.parseInt(split[index]));
			rootNode.left = Deserialize(str);
			rootNode.right = Deserialize(str);
		}
		return rootNode;
	}
}

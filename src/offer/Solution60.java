package offer;
import BinaryTree.TreeNode;

/**
 * ���л������л������ Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��27������9:36:35
 */
public class Solution60 {
	//ǰ�����
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

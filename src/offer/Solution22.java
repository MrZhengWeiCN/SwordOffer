package offer;

/**
 * 判断是否为二叉搜索树的后序遍历 Title: Description: Company:
 * 
 * @author 郑伟
 * @date 2017年10月25日下午9:09:11
 */
public class Solution22 {

	public boolean VerifySquenceOfBST(int[] sequence) {
		if(sequence.length==0){
			return false;
		}
		return fun(sequence,0,sequence.length-1);
	}

	private boolean fun(int[] sequence, int start, int end) {
		if(start>=end){return true;}
		//i为左右子树的间隔位置
		int i = start;
		for (; i < end; i++) {
			if(sequence[i]>sequence[end]){
				break;
			}
		}
		for(int j=i;j<end;j++){
			if(sequence[j]<sequence[end]){
				return false;
			}
		}
		return true&&fun(sequence, start, i-1)&&fun(sequence, i+1, end-1);
	}
}

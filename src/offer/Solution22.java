package offer;

/**
 * �ж��Ƿ�Ϊ�����������ĺ������ Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��25������9:09:11
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
		//iΪ���������ļ��λ��
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

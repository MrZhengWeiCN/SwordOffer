package offer;

/**
 * �ַ�����Ϊ���� Title: Description: Company:
 * 
 * @author ֣ΰ
 * @date 2017��10��27������10:44:21
 */
public class Solution48 {
	public int StrToInt(String str) {
		if(str==null||str.length()==0)
			return 0;
		char[] charArray = str.toCharArray();
		int symbol = 0;
		int sum = 0;
		if(charArray[0]=='+'||charArray[0]=='-')
			symbol=1;
		for (int i = symbol; i < charArray.length; i++) {
			if(charArray[i]>57||charArray[i]<48)
				return 0;
			sum = sum*10+charArray[i]-48;
		}
		return charArray[0]=='-'?sum*-1:sum;
	}
	public static void main(String[] args){
		Solution48 solution48 = new Solution48();
		System.out.println(solution48.StrToInt("-007"));
	} 
}

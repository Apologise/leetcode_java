package com.leetcode;

public class 将大写移到小写后面 {
	public static String upperAfterLower(String str){
		//大写字母的范围是65-90
		char[] s = str.toCharArray();
		int k = 0;//k代表前面已经排序的大写的个数，例如aBB，那么k就是2；表示已经有2个大写字母在正确的位置
		for(int i = s.length-1; i >=0; i--){
			if('A'<=s[i] && s[i]<='Z'){
				char temp = s[i];
				//到正确字母的前一个字母
				int j = i;
				for(; j < s.length-k-1; j++){
					s[j] = s[j+1];
				}
				s[j] = temp;
				k++;
			}
		}
		return String.valueOf(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "asafBasdfDDDdsafD";
		System.out.println(将大写移到小写后面.upperAfterLower(str));
	}

}
